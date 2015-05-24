package com.springapp.common;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by zhuoyangzong on 15/5/22.
 */
public class Util {

    // 把10位时间戳转成60进制
    public static String createCodeFromTS(Timestamp ts){

        // 把时间戳转成int TODO 支持到2038/1/19 11:14:7
        Long lgTs = ts.getTime();

        StringBuffer sb = new StringBuffer();

        boolean ctrl = true;
        double mod = 0;

        while(ctrl) {
            mod = ((double)lgTs) % 60;

            if (mod >= 36) {
                mod += 61;
                sb.append((char) mod);
            } else if (mod >= 10) {
                mod += 55;
                sb.append((char) mod);
            } else {
                sb.append((int)mod);
            }

            lgTs = lgTs/60;

            if (lgTs == 0) {
                ctrl = false;
            }
        }

        return sb.toString();
    }

    // 判断是否是数字
    public static boolean isNumeric(String str){
        for (int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
