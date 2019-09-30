package com.tangsir.z_designmodel.observer;

/**
 * 报纸类
 */
public class Newspaper extends Subject {

    private String paperName;
    private String content;

    public Newspaper(Subject subject,String paperName){
        super.setReaders(subject.getReaders());
        this.paperName = paperName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        sendMess();
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }
}
