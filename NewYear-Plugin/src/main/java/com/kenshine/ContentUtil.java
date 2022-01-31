package com.kenshine;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class ContentUtil {
    private static Properties properties;

    static {
        properties=new Properties();
        InputStream inputStream = ContentUtil.class.getClassLoader().getResourceAsStream("year.properties");
        try {
            //properties.load(inputStream);
            properties.load(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getContent(int i){
        int len = properties.size();
        return properties.getProperty(String.valueOf(i%len));
    }

    public static void main(String[] args) {
        System.out.println(getContent(1));
    }
}
