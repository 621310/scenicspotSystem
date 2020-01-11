package com.example.servicescenicspot.util;

import java.util.Map;

/**
 * 公共全局变量
 */
public class Constants {


    public  static  final String REDIS_KEY="zhbg"+"_";
    // 编码
    public static final String PROJECT_CHARSET = "UTF-8";

    public static final String CurrentUser="XT_11002233001";
    //私钥
    public static final String REDIS_KEY_PRIVATEKEY = "PRIVATEKEY";
    //对称加密key
    public static final String REDIS_KEY_AESKEY = "AESKEY";


    //返回集
    public static final  String RESULTCODE="code";
    public static final  String RESULTCODE_SUCC="200";

    public static final  String RESULTCODE_ERR="201";

    public static final  String RESULTCODE_REPEAT="203";

    public static final  String HAS_PERSON="204";
    public static final  String HAS_DEPART="205";


    public static final  String RESULTMSG="msg";
    public static final  String RESULTMSG_SUCC="succ";
    public static final  String RESULTMSG_ERR="err";

    public static final  String RESULTDATA="data";
    public static final  String RESULT_NO_DATA="";
    public  static void getSuccMsg(Map<String, Object> map, Object obj){
        map.put(Constants.RESULTCODE, Constants.RESULTCODE_SUCC);
        map.put(Constants.RESULTMSG, Constants.RESULTMSG_SUCC);
        map.put(Constants.RESULTDATA,obj);
    }

    public  static   void getErrMsg(Map<String, Object> map,Object obj){
        map.put(Constants.RESULTCODE, Constants.RESULTCODE_ERR);
        map.put(Constants.RESULTMSG, Constants.RESULTMSG_ERR);
        map.put(Constants.RESULTDATA,obj);
    }

    public  static   void getErrMsg(Map<String, Object> map,String msg){
            map.put(Constants.RESULTCODE, Constants.RESULTCODE_ERR);
            map.put(Constants.RESULTMSG,Constants.RESULTMSG_ERR);
            map.put(Constants.RESULTDATA,msg);
    }

}
