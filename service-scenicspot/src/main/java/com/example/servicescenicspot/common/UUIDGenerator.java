package com.example.servicescenicspot.common;
/**
 * @author fyy
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 *@author fyy
 */
public class UUIDGenerator {
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        // 去掉"-"符号
        String temp = str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
        return temp;
    }

    public static String getOrderCode(){
        SimpleDateFormat dmDate = new SimpleDateFormat("yyyyMMddHHmmss"); // 获取当前时间
        Random random = new Random(); // 定义随机数
        int ran = random.nextInt(1000000); // 随机数长度位数
        Date date = new Date();
        String dateran = dmDate.format(date);
        String code = dateran+ran;
        return code;
    }

}
