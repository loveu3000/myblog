package com.tangsir.z_designmodel.mediator;

import lombok.Setter;

@Setter
public class MediatorImp implements Mediator {
    private CDDriver cdDriver;
    private CPU cpu;
    private SoundCard soundCard;
    private VideoCard videoCard;



    @Override
    public void change(Colleague colleague) {
        if(colleague==cdDriver){

        }else if(colleague==cpu){

        }else{}
    }

    private void openCDDriver(CDDriver cdDriver){
        String data = cdDriver.getData();
        this.cpu.executeDate(data);
    }
    private void openCpu(CPU cpu){

    }
}
