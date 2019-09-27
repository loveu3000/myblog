package com.tangsir.z_designmodel.facadeModel;

public class Facade {
    private Facade(){};

    public static void test(){
        AModelApi a = new AModelImpl();
        a.test();
        BModelApi b = new BModelImpl();
        b.test();
    }
}
