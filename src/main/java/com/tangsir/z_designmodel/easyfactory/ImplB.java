package com.tangsir.z_designmodel.easyfactory;

public class ImplB implements Api{
    @Override
    public void apiMethoed() {
        System.out.println("这是ImplB的实现方法");
    }
    public void implMethoed(){
        System.out.println("这是Impl自己方法");
    }
}
