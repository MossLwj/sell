package com.lwj.sell.converter;

import com.lwj.sell.dto.OrderDTO;
import com.lwj.sell.entity.OrderMaster;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created By lwj
 * 订单实体转订单DTO类型转换器
 * 2017/11/23 0023 09:09
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList ){
        return orderMasterList.stream().map(e -> convert(e)).collect(Collectors.toList());
    }
}
