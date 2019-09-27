package com.tangsir.z_designmodel.adapter;

import java.io.*;
import java.util.List;

public class LogFileOperate implements LogFileOperateApi {

    private String logFilePathName = "log.log";

    @Override
    public List<LogModel> redLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;
    try{
        File f = new File(logFilePathName);
        if(f.exists()){
            oin = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(f)
                    )
            );
        }
    }catch (IOException e){
        System.out.println("IO异常");
        e.printStackTrace();
    }finally {
        try{
            if(oin != null){
                oin.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        File f = new File(logFilePathName);
        ObjectOutputStream oout = null;
        try{
            oout = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(f)
                    )
            );
            oout.writeObject(list);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                oout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public LogFileOperate(String logFilePathName) {
        if (logFilePathName != null
                && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }
}
