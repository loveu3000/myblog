package com.tangsir.z_designmodel.adapter;

import java.util.List;

public interface LogFileOperateApi {

    public List<LogModel> redLogFile();

    public void writeLogFile(List<LogModel> list);

}
