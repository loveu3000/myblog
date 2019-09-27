package com.tangsir.z_designmodel.factorymethod;

public class ExportTxt implements ExportApi {
    @Override
    public void ExportFile(String context) {
        System.out.println("导出了txt格式文件");
    }
}
