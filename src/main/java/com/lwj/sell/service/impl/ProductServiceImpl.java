package com.lwj.sell.service.impl;

import com.lwj.sell.dao.ProductInfoRepository;
import com.lwj.sell.dto.CartDTO;
import com.lwj.sell.entity.ProductInfo;
import com.lwj.sell.enums.ProductStatusEnum;
import com.lwj.sell.enums.ResultEnum;
import com.lwj.sell.exception.SellException;
import com.lwj.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductInfoRepository infoRepository;

    @Override
    public ProductInfo findOne(String productId) {
        return infoRepository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return infoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return infoRepository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return infoRepository.save(productInfo);
    }

    @Override
    @Transactional
    public void increaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO : cartDTOList) {
            ProductInfo productInfo = infoRepository.getOne(cartDTO.getProductId());
            if (productInfo == null) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            Integer result = productInfo.getProductStock() + cartDTO.getProdectQuantity();
            productInfo.setProductStock(result);
            ProductInfo updateResult = infoRepository.save(productInfo);
        }
    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO : cartDTOList) {
            ProductInfo productInfo = infoRepository.findOne(cartDTO.getProductId());
            //如果productInfo为null，说明不存在该商品
            if (productInfo == null) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            //减库存操作
            Integer result = productInfo.getProductStock() - cartDTO.getProdectQuantity();
            if (result < 0){
                throw new SellException(ResultEnum.PRODUCT_NOT_ENOUGH);
            }
            productInfo.setProductStock(result);
            infoRepository.save(productInfo);
        }
    }
}
