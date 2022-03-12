package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("C:\\Users\\aleks\\Desktop\\pro.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("cacheSize"));
        
//        properties.setProperty("timeout", "30");
//        properties.setProperty("cacheSize", "100");
//
//        try {
//            properties.store(new FileOutputStream("C:\\Users\\aleks\\Desktop\\pro.properties"), "");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
