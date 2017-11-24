package com.lwj.sell.exception;

import com.lwj.sell.enums.ResultEnum;

/**
 * 异常类
 * Created By lwj
 * 2017/10/18 0018 15:35
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
