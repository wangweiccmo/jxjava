package com.smartcampus.provider.utils;


import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;

import java.sql.Timestamp;

public class ExcelHelper {
    private static Logger logger = Logger.getLogger(ExcelHelper.class);

    public static Boolean cellIsNull(Cell cell){
        if(cell != null){
           if(!"".equals(cell.toString())){
               return false;
           }
        }

        return true;
    }
    public static String cellToString(Cell cell){
        String resStr = null;
        if(cell != null){
            resStr = cell.toString();
        }
        if(resStr != null){
            resStr = resStr.trim();
        }
        return resStr;
    }
    public static Timestamp cellToTime(Cell cell){
        Timestamp tim = null;
        if(cell != null){
            String cellStr = cell.toString();
            if(cellStr != null && !"".equals(cellStr)){
                cellStr = cellStr.trim();
                cellStr = cellStr.replaceAll("/", "-");
                String time = " 00:00:00";
                if(cellStr.length() < 14 ){
                    cellStr = cellStr + time;
                }
                System.out.println(cellStr);
                tim = Timestamp.valueOf(cellStr);
            }

        }
        return tim;
    }

}
