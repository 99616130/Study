package com.peng.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//公共返回对象(lochost的注解Date,NoArgsConstructor无参构造,AllArgsConstructor全参构造)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    //返回的状态码
    private long code;
    //提升信息
    private String message;
    //返回的对象
    private Object obj;

    //成功返回结果
    public static RespBean success(String message){
        return new RespBean(200,message,null);
    }

    //成功返回结果
    public static RespBean success(String message,Object obj){
        return new RespBean(200,message,obj);
    }

    //失败返回结果
    public static RespBean error(String message){
        return new RespBean(500,message,null);
    }

    //失败返回结果
    public static RespBean error(String message,Object obj){
        return new RespBean(500,message,obj);
    }
}
