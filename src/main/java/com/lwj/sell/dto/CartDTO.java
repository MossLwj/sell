package com.lwj.sell.dto;

import lombok.Data;

/**
 * 购物车
 * Created By lwj
 * 2017/10/18 0018 17:04
 */
@Data
public class CartDTO {
    //商品id
    private String productId;
    //商品件数
    private Integer prodectQuantity;

    public CartDTO(String productId, Integer prodectQuantity) {
        this.productId = productId;
        this.prodectQuantity = prodectQuantity;
    }
}
