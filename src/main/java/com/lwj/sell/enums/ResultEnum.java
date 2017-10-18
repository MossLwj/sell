package com.lwj.sell.enums;

import lombok.Getter;

/**
 * 返回给前段的消息
 * Created By lwj
 * 2017/10/18 0018 15:36
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10, "商品不存在"),;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
