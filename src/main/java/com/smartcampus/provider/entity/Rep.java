/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.8
 */

package com.smartcampus.provider.entity;


import com.smartcampus.provider.constant.RepCode;

public class Rep {

    private int code;

    private String msg;

    private Object data;

    private Object extend;

    private Object extend2;

    public Rep(int code,String msg, Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Rep(RepCode repCode, Object data){
        this.code = repCode.code();
        this.msg = repCode.msg();
        this.data = data;
    }


    public Rep(RepCode repCode, Object data, Object extend){
        this.code = repCode.code();
        this.msg = repCode.msg();
        this.data = data;
        this.extend = extend;
    }

    public Rep(RepCode repCode, Object data, Object extend, Object extend2){
        this.code = repCode.code();
        this.msg = repCode.msg();
        this.data = data;
        this.extend = extend;
        this.extend2 = extend2;
    }

    public Rep(RepCode repCode){
        this.code = repCode.code();
        this.msg = repCode.msg();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getExtend() {
        return extend;
    }

    public void setExtend(Object extend) {
        this.extend = extend;
    }

    public Object getExtend2() {
        return extend2;
    }

    public void setExtend2(Object extend2) {
        this.extend2 = extend2;
    }
}