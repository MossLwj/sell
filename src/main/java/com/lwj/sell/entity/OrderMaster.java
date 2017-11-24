package com.lwj.sell.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lwj.sell.enums.OrderStatusEnum;
import com.lwj.sell.enums.PayStatusEnum;
import com.lwj.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单主表实体
 * Created By lwj
 * 2017/10/18 0018 13:29
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /** 支付状态，默认为0未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    /** 创建时间. */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

}
