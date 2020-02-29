package com.bin.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword("nishidashabi");
        String user = basicTextEncryptor.encrypt("root");
        String password = basicTextEncryptor.encrypt("123123");
        System.out.println(user);
        System.out.println(password);
        System.out.println(basicTextEncryptor.decrypt("0uodufUB4v6g/bcRXojpdQ=="));
        System.out.println(basicTextEncryptor.decrypt("zxrUb7xNQXo6zsW5p9oRjw=="));

    }
}
