package com.tangsir.z_designmodel.singleton;

/**
 * 利用类级内部类 和 多线程缺省同步锁实现 延迟加载和线程安全
 */
public class LazyInitializationHolder {

    /**
     * 类级的内部类，也就是静态的成员式内部类，
     * 该内部类的实例与外部类的实例没有绑定关系，
     * 而且只有被调用时才会装载，实现延时加载
     */
    private static class SingletonHolder{
        private static LazyInitializationHolder instance = new  LazyInitializationHolder();
    }

    /**
     * 构造方法
     */
    private LazyInitializationHolder(){
        initMethod();
    };

    /**
     * 全局访问点
     * @return
     */
    public static LazyInitializationHolder getInstance(){
        return SingletonHolder.instance;
    }

    /**
     * 初始化这个类的方法
     */
    private void initMethod(){

    }
}
