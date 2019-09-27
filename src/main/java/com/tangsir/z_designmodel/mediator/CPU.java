package com.tangsir.z_designmodel.mediator;

/**
 * cpu类 同事类
 */
public class CPU extends Colleague {
    /**
     * 构造方法
     * @param mediator
     */
    public CPU(Mediator mediator) {
        super(mediator);
    }

    private String videoDate =  "";
    private String videoSount = "";

    public String getVideoDate(){
        return videoDate;
    }
    public String getVideoSount(){
        return videoSount;
    }

    /**
     * 开始执行
     * @param data
     */
    public void executeDate(String data){
        String[] split = data.split(",");
        this.videoDate = split[0];
        this.videoSount = split[1];
        //通知主板工作完成
        this.getMediator().change(this);

    }

}
