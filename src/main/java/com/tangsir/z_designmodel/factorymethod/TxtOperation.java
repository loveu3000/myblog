package com.tangsir.z_designmodel.factorymethod;

public class TxtOperation extends CreateExportInstance {
    @Override
    public ExportApi getIntance() {
        return new ExportTxt();
    }
}
