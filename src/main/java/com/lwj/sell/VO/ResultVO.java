package com.lwj.sell.VO;

import lombok.Data;

/**
 * 返回给前段页面的类
 * @param <T>
 */
@Data
public class ResultVO<T> {

    /** 结果码 */
    private Integer code;
    /** 提示信息 */
    private  String msg;
    /** 具体内容 */
    private T data;

}
