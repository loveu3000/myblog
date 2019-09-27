package com.tangsir.z_designmodel.factorymethod;

public class DBOperation extends CreateExportInstance {
    @Override
    public ExportApi getIntance() {
        return new ExportDB();
    }
}
