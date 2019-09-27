package com.tangsir.z_designmodel.easyfactory;

public class Zmain {
    public static void main(String[] args) {
        Api api = Factory.getApi("1");
        api.apiMethoed();
        System.out.println("这是个简单工厂");
    }
}
