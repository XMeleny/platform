package com.example.platform;

import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {
    public static String md5(String input){
        MessageDigest md;
        String output="";
        try {
            md = MessageDigest.getInstance("MD5");//利用哈希算法，MD5
            //面向字节处理，所以可以处理字节的东西，如图片，压缩包。。
            byte[] in = input.getBytes();
            byte[] out = md.digest(in);
            //将md5处理后的output结果利用Base64转成原有的字符串,不会乱码
            output = Base64.encodeBase64String(out);
            return output;
        } catch (NoSuchAlgorithmException e) {
            System.out.println("密码加密失败");
            return input;
        }
    }
}
