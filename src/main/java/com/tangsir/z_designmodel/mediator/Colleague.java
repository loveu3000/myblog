package com.tangsir.z_designmodel.mediator;

/**
 * 同事类父类
 */
public abstract class Colleague {
    /*引入主板对象*/
    private Mediator mediator;

    /*构造方法*/
    public Colleague (Mediator mediator){
        this.mediator = mediator;
    }

    /*获取主板对象方法*/
    public Mediator getMediator(){
        return mediator;
    }
}
