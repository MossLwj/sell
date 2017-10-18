package com.lwj.sell.enums;

import lombok.Getter;

/**
 * Created By lwj
 * 2017/10/18 0018 13:43
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
