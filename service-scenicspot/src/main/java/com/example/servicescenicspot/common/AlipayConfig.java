package com.example.servicescenicspot.common;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2016101900723497";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCFM/4rdr3Zg22yRZK1jmgAWnmfA2jssa/saXJUeFrcHuJWQHUNwp3uZBZvNNX9TFcN5EK1niaRwR9gho37ftylBb6P36y/AhlMq+i8W/TcpMT4AzR15fi1KBeMO3jDqVm/x/lCrhVn0RVFGIK0X0LVJkF+Sil9jsHd5Vuh/o61zlH2ZKOOFjPUMybC3Pyc/wlulyYXtqUp9PfMOc6TjRGLY8ZCN1P9S9ayoTY5DLQkCLICHRmwKVq5iN6x7pu7+3bmKtrbQx4el1+iWKtzFs1m9YXBeOgs9FNGgpAMfx42i5rx8E/LNmJ/tA04/m9b2ivcr4JiVCJA+IqZ6zyExRi5AgMBAAECggEAcchd/2ao+ZrJI5VGowwITvT6Gxjgkf+elUXlwb4lbw56rM7WrnBmU/LvLwNlH8AMRPONAHMd4zeiw+NseT5+4AAuLdwVRfxW/CWE4xFx8uBU2L50G5ncf3LF2qYanJiW77m0dH8cDdiOYL11OPp+rnDFVUmoc3Z0qEV5psE5ypY89VRIKwLyp1gM4vEV+2KwZDHeUf2LLiXg1ue59iLxiUXKQ0RtocsZg8iUoO8J2qdaU893PHFnKZmbHY5NB1uTq6ChFgSZY1G6Z0jPEmA/+FGELye+6mtY8lZU9DYZ8CAtlRGEOk3mnopcEmYRPhVSKCwfMvoUxCDPVJ+7mPzR4QKBgQDH+TP8/yPO7KI5hzf5+Q9Wgz8cFTXzHbdEVoRpTY7WdELvx2CgvD0HPki4JCz+jmVp70MMbG7cSY0ealJ1QK2t4ROtzewE9arU9RzCRokUFs0g5ch95CAwnESa09/MCf/TYIRRG3s94KPbXHMpByndYw5cYETBTnwaef9nPccTRQKBgQCqhck2xcVTQHgc84MFMvSJvasps1sJcktL2kXuixXfy8d1Q6sGYRecnjulECpRLvF7lisGH0LjEGWsqBwkoGorSTUBnaKJGHvgOyJ5iPdBchmmDjOhLUMTqtb9FYZs6k/Ge6+5A7wNrCoqgTtVPN7W2bRuQTu/AsImVHDP3m0s5QKBgQCFQCNKVGDyA3Bd0SKVqUZ1KWOmPOQEKirymIwG9y1U7Yek60ASGxy3dONUAJcS0KP3IP2Wi7Kbi09Dkyl7BCw3DyHj0LGS5Hh/Cw2szv+MqVzqrPMaICbq/VYhrUkVVxxnJ4tD2IIYy1WkWEhMcH+PC/CH0YY/ISNFKUHs85dx2QKBgQCWtNDloJrJ/kNpyumz8ZngFoosu8AstB/J9SozLidx+Eba46hGZg8ZM1uhgYz03Rk9UbXKnlxeE8LYemcNE91hTj0TpX7dzY7F2V2ZrixgYfg7I3gL7dXHjwic+qYoollJIU1npd5Q8yT9FeQbbEXB+vyVKQAly8lNWPmvLXSt5QKBgQCIxji13cUX9z8/w1Xjsu7QwnQvM2IYjS/nv3t43u5SOGNSO+uJhA0Qa0b0anixG+klCS41aB4HV2Whv8E54PhyTfgkbjGv+qSx1wXMjT1NN27HEXCzRet7FtkJ5z+fDIV1PCuQ5OlnGGodncuC14okqmTyJIp/eeWAXvf5EAxpiQ==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2hhRf9gQKLZXJa2RafjNvuzXTtCZLxZTCRLu30IXtws0fcn5gcff/JRG1H0z4V2nwkwBbUmRQEV6p8a0E+U/fMzZBWfrKcIfobOcx8JXpX2p1eXDTFVYdqTlClzB6u3XrY/tXwUbr1QIdNo0n/g0bVTjuVJjYzvJ4E/iY40FyF8BcCLBCd4O9BPO8OaGZLFxAABJTby2xtBvsuCt69rpt6lvbaNy/dZT3sY9PdCgLoROwJZmnw5V4pI3jvNIjxXGrKYCYTfp97kLddvSIK33Tn/ilX5OUFe817aSSVx3t02sd/iXzfr1I+g653yf/4299WuMyxix+m20QpMHvojlvwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//    public static String notify_url = "http://localhost:8081/paySuccess";
    public static String notify_url = "http://47.103.15.187:8081/paySuccess";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
//    public static String return_url = "http://localhost:8081/paySuccess";
    public static String return_url = "http://47.103.15.187:8081/paySuccess";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

