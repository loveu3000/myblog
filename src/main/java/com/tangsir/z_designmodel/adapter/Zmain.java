package com.tangsir.z_designmodel.adapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Zmain {
    public static void main(String[] args) {
        LogModel logModel = new LogModel();
        logModel.setLogContent("凡士林");
        logModel.setLogId("1");
        logModel.setOperateTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));
        List<LogModel> list = new ArrayList();
        list.add(logModel);

        LogFileOperateApi logOperate = new LogFileOperate("D://log.log");
        logOperate.writeLogFile(list);

        List<LogModel> logModels = logOperate.redLogFile();
        System.out.println(logModels);

    }
}
