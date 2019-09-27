package com.tangsir.z_designmodel.adapter;

import java.util.List;

/**
 * 这是一个双向适配器
 */
public class AdapterTwoWay implements LogFileOperateApi,LogDbOPerateApi {

    private LogDbOPerateApi logDbOPerateApi;
    private LogFileOperateApi logFileOperateApi;

    /**
     * 构造方法 双向适配
     * @param logDbOPerateApi
     * @param logFileOperateApi
     */
    public AdapterTwoWay(LogDbOPerateApi logDbOPerateApi, LogFileOperateApi logFileOperateApi) {
        this.logDbOPerateApi = logDbOPerateApi;
        this.logFileOperateApi = logFileOperateApi;
    }

    @Override
    public void insertLog(LogModel l) {

    }

    @Override
    public void updateLog(LogModel l) {
        //略
    }

    @Override
    public void deleteLog(LogModel l) {
        //略
    }

    @Override
    public List<LogModel> getAlllog() {
        return null;
    }

    @Override
    public List<LogModel> redLogFile() {
        return logFileOperateApi.redLogFile();
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        logFileOperateApi.writeLogFile(list);
    }
}
