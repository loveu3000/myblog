package com.tangsir.z_designmodel.factorymethod;

public abstract class CreateExportInstance {

    public abstract ExportApi getIntance();

    public void export(String data){
        ExportApi intance = getIntance();
        intance.ExportFile(data);
    }
}
