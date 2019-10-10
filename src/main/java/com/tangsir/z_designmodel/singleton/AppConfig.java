package com.tangsir.z_designmodel.singleton;

import lombok.Getter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Getter
public class AppConfig {
    private String parameterA;
    private String parameterB;

    public AppConfig(String fileName){
        this.readConfig(fileName);
    }


    public void readConfig(String fileName){
        Properties pro = new Properties();
        InputStream in = null;
        try {
            in = AppConfig.class.getResourceAsStream(fileName);
            pro.load(in);
            this.parameterA = pro.get("parameterA").toString();
            this.parameterA = pro.get("parameterA").toString();
        } catch (IOException e) {
            System.out.println("装配文件出错");
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
