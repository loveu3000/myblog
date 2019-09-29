package com.tangsir.z_designmodel.observer;

/**
 * 报纸类
 */
public class Newspaper extends Subject {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        sendMess();
    }

}
