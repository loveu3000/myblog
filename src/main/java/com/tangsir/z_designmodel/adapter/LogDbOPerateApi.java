package com.tangsir.z_designmodel.adapter;

import java.util.List;

public interface LogDbOPerateApi {

    public void insertLog(LogModel l);

    public void updateLog(LogModel l);

    public void deleteLog(LogModel l);

    public List<LogModel> getAlllog();

}
