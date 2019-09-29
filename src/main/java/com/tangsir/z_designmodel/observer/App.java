package com.tangsir.z_designmodel.observer;

public class App {
    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper();
        newspaper.addReader(new Reader("张三"));
        newspaper.addReader(new Reader("李四"));
        newspaper.addReader(new Reader("王二"));
        newspaper.addReader(new Reader("老五"));
        newspaper.setContent("研磨设计模式");

       /* Subject subject = new Subject();
        subject.addReader(new Reader("张三"));
        subject.addReader(new Reader("李四"));
        subject.addReader(new Reader("王二"));
        subject.addReader(new Reader("老五"));
        ((Newspaper)subject).setContent("研磨设计模式");
        ((Newspaper)subject).setContent("java编程思想");*/
    }
}
