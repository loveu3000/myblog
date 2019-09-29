package com.tangsir.z_designmodel.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 报社类，被观察类
 */
public class Subject {
    /**
     * 所有读者类
     */
    private List<ReaderApi> readers = new ArrayList<>();

    /**
     * 添加读者
     * @param reader
     */
    public void addReader(ReaderApi reader){
        readers.add(reader);
    }
    /**
     * 删除读者
     * @param reader
     */
    public void delReader(ReaderApi reader){
        readers.remove(reader);
    }

    /**
     * 群发消息
     */
    public void sendMess(){
        readers.forEach(reader -> {
            reader.updateStatus(this);
        });
    }
}
