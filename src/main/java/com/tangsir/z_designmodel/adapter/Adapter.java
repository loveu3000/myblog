package com.tangsir.z_designmodel.adapter;

import java.util.List;

/**
 * 这是一个单向适配器
 */
public class Adapter implements LogDbOPerateApi {

    private LogFileOperateApi adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     * @param adaptee 需要被适配的对象
     */
    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void insertLog(LogModel l) {
        List<LogModel> logModels = adaptee.redLogFile();
        logModels.add(l);
        adaptee.writeLogFile(logModels);
    }

    @Override
    public void updateLog(LogModel l) {
        //类似
    }

    @Override
    public void deleteLog(LogModel l) {
        //类似
    }

    @Override
    public List<LogModel> getAlllog() {
        return adaptee.redLogFile();
    }
}
