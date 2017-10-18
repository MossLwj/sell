package com.lwj.sell.dto;

import com.lwj.sell.entity.OrderDetail;
import com.lwj.sell.enums.OrderStatusEnum;
import com.lwj.sell.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created By lwj
 * 2017/10/18 0018 15:19
 */
@Data
public class OrderDTO {

    /** 订单id. */
    private String orderId;
    /** 买家名字. */
    private String buyerName;
    /** 买家手机号. */
    private String buyerPhone;
    /** 买家地址. */
    private String buyerAddress;
    /** 买家微信Openid. */
    private String buyerOpenid;
    /** 订单总金额 */
    private BigDecimal orderAmount;
    /** 订单状态，默认为新下单 */
    private Integer orderStatus;
    /** 支付状态，默认为0未支付 */
    private Integer payStatus;
    /** 创建时间. */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
