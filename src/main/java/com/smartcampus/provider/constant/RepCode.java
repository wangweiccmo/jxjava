package com.smartcampus.provider.constant;

public enum RepCode {
//    public static final String OK = "返回成功";
//    public static final String NG = "服务器发生异常！";
//    public static final String N_NO_LOGIN = "用户没有登录！";
//    public static final String N_TIME_OUT = "登录超时！";

    OK(0, "返回成功!"),
    NG(1, "返回失败!"),
    NG_LOGIN_ERROR(1001, "用户名密码不对！"),
    NG_LOGIN_FREEZE(1002, "账号被冻结，请联系管理员！"),
    NG_AUDITING_WAIT(1003, "正在审核，请审核通过后再登录！"),
    NG_AUDITING_FAIL(1004, "审核失败，请查看审核失败原因！"),
    NG_FILE_UPLOAD(1101, "文件上传失败！"),
    NG_LOGIN_TIME_OUT(1003, "登录超时！"),
    NG_OTHER(9999, "其他异常!");
    int code;
    String msg;

    RepCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }



    public int code() {
        return code;
    }



    public String msg() {
        return msg;
    }





}
