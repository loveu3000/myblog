package com.tangsir.z_designmodel.mediator;

/**
 * 声卡类 同事类
 */
public class VideoCard extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data){
        System.out.println("您正在收看的是"+data);
    }
}
