package com.tangsir.common.exception;

import lombok.Data;

@Data
public class HwException extends RuntimeException {

    private int code;


    public HwException() {
    }

    public HwException(int code) {
        this.code = code;
    }

    public HwException(String message){
        super(message);
    }

    public HwException(int code,String message){
        super(message);
        this.code = code;
    }


}
