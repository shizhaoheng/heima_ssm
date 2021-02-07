package com.itheima.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {
    private static BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    public static String encodePassword(String password){
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args) {
        String password="123456";
        String pwd = encodePassword(password);
        //$2a$10$ac0zSHqVAyYxWg7HXBtERuvPmQBgR.YD77CtTWLmiBmDvWnifQlka
        //$2a$10$1zK6GsLaWxAIoEj08kvSO.5o22CyE/2dtkYyKqZOjruNBSrLE2gTu
        System.out.print(pwd);
    }
}
