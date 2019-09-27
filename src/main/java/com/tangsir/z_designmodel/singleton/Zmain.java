package com.tangsir.z_designmodel.singleton;

public class Zmain {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig("appconfig.properties");
        System.out.println(appConfig.getParameterA()+appConfig.getParameterB());
    }
}
