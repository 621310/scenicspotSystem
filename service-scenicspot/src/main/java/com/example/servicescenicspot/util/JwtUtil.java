package com.example.servicescenicspot.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@Component
public class JwtUtil {

    //实例化日志对象，引用jar包org.slf4j.Logger
    private static final Logger logger = LoggerFactory.getLogger(com.cloud.commonsmng.security.JwtUtil.class);

    //jwt 有效时间为15分钟
    private static final long EXPIRE_TIME=60*1000*15;

    public static final String JWT_USERID = "userid";

    public static final String JWT_DEVID = "devid";

    public static final String JWT_UUID = "uuid";

    public static final String JWT_ROLEID = "roleid";


    private static final String TOKEN_SECRIT="WSADSsdf1sasfds34311sf";

    //创建token
    public static String CreateToken(String userid,String devid,String uuid,String roleid){
        String token="";
        try {
            String uid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            Date dt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRIT);
            token=JWT.create()
                    .withClaim(JWT_USERID,userid)
                    .withClaim(JWT_DEVID,devid)
                    .withClaim(JWT_UUID,uuid)
                    .withClaim(JWT_ROLEID,roleid)
                    .sign(algorithm);

        }catch (Exception ex)
        {
            logger.error("创建token 出错",ex.getMessage());
        }
        return token;
    }


    public static String RefreshToken(String username,String userid){
        String token="";
        try {
            String uid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            Date dt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRIT);
            Map<String,Object> header=new HashMap<>();
            header.put("type","JWT");
            header.put("alg","HS256");
            token=JWT.create()
                    .withHeader(header)
                    .withClaim("username",username)
                    .withClaim("userid",userid)
                    .withExpiresAt(dt)
                    .sign(algorithm);

        }catch (Exception ex)
        {
            logger.error("创建token 出错",ex.getMessage());
        }
        return token;
    }

    //解密token
    public  static Map<String,String> verifyToken(String token){
        Algorithm algorithm;
        Map<String,Claim> map=new HashMap<>();

        try{
            algorithm=Algorithm.HMAC256(TOKEN_SECRIT);
            JWTVerifier verifier=JWT.require(algorithm).build();


            DecodedJWT jwt=verifier.verify(token);
            map=jwt.getClaims();
        }
        catch (Exception ex){
            logger.error("token 转换出错",ex.getMessage());
        }
        Map<String,String> resultMap=new HashMap<>(map.size());
        map.forEach( (k,v)->resultMap.put(k,v.asString()));

        return resultMap;
    }


    //解密token
    public  static boolean verify(String token) {
        Algorithm algorithm;
        Map<String,Claim> map=new HashMap<>();

        try{
            algorithm=Algorithm.HMAC256(TOKEN_SECRIT);
            JWTVerifier verifier=JWT.require(algorithm).build();


            DecodedJWT jwt=verifier.verify(token);
            return true;
        }
        catch (Exception ex){
            logger.error("token 转换出错",ex.getMessage());
            return false;
        }



    }



    public boolean JwtTokenRefresh(String userName,String password){

        HttpServletRequest httpServletRequest=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpServletResponse Response=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        httpServletRequest.getHeader("authorization");

       // String gettoken=(String)redisTemplate.opsForValue().get("dataManage");

        return false;

    }

}
