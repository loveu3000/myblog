package com.tangsir.z_designmodel.mediator;

/**
 * 同事类 光驱
 */
public class CDDriver extends Colleague {
    /**
     * 构造方法
     * @param mediator
     */
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    /**
     * 光驱读取出来的数据
     */
    private String data = "";

    /**
     * 获取读取的光驱数据
     * @return
     */
    public String getData(){
        return data;
    }
    public void readCD(){
        this.data = "好好学习设计模式";
        //通知主板自己发生了变化
        this.getMediator().change(this);
    }
}
