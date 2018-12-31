package com.smartcampus.provider.utils;



public class StringUtils {

    public static Boolean isBlank(String str){
        if(str != null){
           if(!"".equals(str)){
               return false;
           }
        }

        return true;
    }

}
