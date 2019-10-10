package com.tangsir.z_designmodel.observer;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {

        /**
         * Subject 是一个父类 ，有一个公共属性，多个子类，
         * 要实现先初始化父类，设置公共属性，再用父类主动初
         * 始化子类，使用这个属性
         */
        Subject subject = new Subject();
        subject.addReader(new Reader("张三"));
        subject.addReader(new Reader("李四"));
        Newspaper newspaper = new Newspaper(subject,"人民日报");
        Newspaper newspaper2 = new Newspaper(subject,"早间新闻");
        newspaper.setContent("1");
        newspaper2.setContent("2");



    }
}
