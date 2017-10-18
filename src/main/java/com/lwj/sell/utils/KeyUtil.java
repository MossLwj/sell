package com.lwj.sell.utils;

import java.util.Random;

/**
 * Created By lwj
 * 2017/10/18 0018 16:42
 */
public class KeyUtil {

    /**
     * synchronized防止多线程并发的时候出现重复的id
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
