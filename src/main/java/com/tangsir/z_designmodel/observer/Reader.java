package com.tangsir.z_designmodel.observer;

public class Reader implements ReaderApi {
    private String name;

    @Override
    public void updateStatus(Subject subject) {
        System.out.println(name + "收到了"+((Newspaper)subject).getPaperName()+"报纸，报纸内容为"+((Newspaper)subject).getContent());
    }

    public Reader(String name) {
        this.name = name;
    }
}
