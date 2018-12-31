package com.smartcampus.provider.entity;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

public class SignToken {
    private String id; // id
    private String role; // 权限
    private String status; // 状态
    private Object extData; // 其他参数，不能太多

    public SignToken(String id, String role, String status) {
          this.id=id;
          this.role = role;
          this.status = status;
    }
    public SignToken(String id, String role, String status,Object ext) {
        this.id=id;
        this.role = role;
        this.status = status;
        if(ext!=null){
            this.extData = ext;
        }
    }

}
