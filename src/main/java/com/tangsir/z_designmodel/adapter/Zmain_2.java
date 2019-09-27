package com.tangsir.z_designmodel.adapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zmain_2 {
    public static void main(String[] args) {
        LogModel logModel = new LogModel();
        logModel.setLogContent("凡士林");
        logModel.setLogId("1");
        logModel.setOperateTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));

        LogFileOperateApi logOperate = new LogFileOperate("D://log.log");

        Adapter adapter = new Adapter(logOperate);
        adapter.insertLog(logModel);

    }
}
