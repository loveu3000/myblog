package com.tangsir.z_designmodel.easyfactory;

public class ImplA implements Api{
    @Override
    public void apiMethoed() {
        System.out.println("这是ImplA的实现方法");
    }

    public void implAMethoed(){
        System.out.println("这是ImplA的自己方法");
    }
}
