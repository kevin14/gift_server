package com.springapp.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by zhuoyangzong on 15/5/16.
 */
public class MD5Util {

    public static String convertMd5(String str) {

        byte [] buf = str.getBytes();
        try {

            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(buf);
            byte [] tmp = md5.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b:tmp) {
                sb.append(Integer.toHexString(b&0xff));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}
