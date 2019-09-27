package com.tangsir.z_designmodel.easyfactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {
    private Factory(){};

    public static Api getApi(String flag){
        Properties pro = new Properties();
        InputStream is = null;
        try {
             is = Factory.class.getResourceAsStream("impPropertys.properties");
            pro.load(is);
        } catch (IOException e) {
            System.out.println("加载配置文件失败 错误信息如下");
            e.printStackTrace();
        }
        String classPath = pro.getProperty("imp" + flag);

        Api api = null;

        try{
            api = (Api)Class.forName("com.tangsir.z_designmodel.easyfactory.ImplA").newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return  api;
    }
}
