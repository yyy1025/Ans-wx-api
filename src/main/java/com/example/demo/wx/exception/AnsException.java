package com.example.demo.wx.exception;

import lombok.Data;

@Data
public class AnsException extends RuntimeException{
//    类中包括状态码和消息
    private String msg="";
    private int code=500;
    public AnsException(String msg){
        super(msg);
        this.msg=msg;
    }
//    重载的构造器
    public AnsException(String msg,Throwable e){
        super(msg,e);
        this.msg=msg;
    }
    public AnsException(String msg,int code){
        super(msg);
        this.msg=msg;
        this.code=code;

    }
}
