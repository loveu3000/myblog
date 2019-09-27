package com.tangsir.z_designmodel.factorymethod;

public class Zmain {
    public static void main(String[] args) {
        CreateExportInstance instace = new DBOperation();
        instace.export("111");


    }

}
