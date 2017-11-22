package com.lwj.sell.service.impl;

import com.lwj.sell.dao.OrderMasterRepository;
import com.lwj.sell.dto.OrderDTO;
import com.lwj.sell.entity.OrderDetail;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created By lwj
 * 2017/11/22 0022 15:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    private final String BUYER_OPENID = "1101110";

    private final String orderId = "1511338683669869221";

    @Test
    public void create() throws Exception {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("杰杰陆");
        orderDTO.setBuyerAddress("绍兴");
        orderDTO.setBuyerPhone("123456789");
        orderDTO.setBuyerOpenid(BUYER_OPENID);
        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail1 = new OrderDetail();
        orderDetail1.setProductId("123458");
        orderDetail1.setProductQuantity(1);
        orderDetailList.add(orderDetail1);

        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setProductId("123457");
        orderDetail2.setProductQuantity(2);
        orderDetailList.add(orderDetail2);

        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO result = orderService.create(orderDTO);
        log.info("【创建订单】： result={}", result);
    }

    @Test
    public void findOne() throws Exception {
        OrderDTO orderDTO = orderService.findOne(orderId);
        log.info("查询单个订单：result={}", orderDTO);
        Assert.assertEquals(orderId, orderDTO.getOrderId());
    }

    @Test
    public void findList() throws Exception {
    }

    @Test
    public void cancel() throws Exception {
    }

    @Test
    public void finish() throws Exception {
    }

    @Test
    public void paid() throws Exception {
    }

}