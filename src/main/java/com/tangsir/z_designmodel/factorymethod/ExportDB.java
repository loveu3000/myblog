package com.tangsir.z_designmodel.factorymethod;

public class ExportDB implements ExportApi {
    @Override
    public void ExportFile(String context) {
        System.out.println("导出了DB格式文件");
    }
}
