package com.tangsir.z_designmodel.prototype;

import lombok.Data;

import java.util.Date;

@Data
public class CompanyOrder implements OrderApi,Cloneable {

    private String companyName;
    private Integer orderNum;
    private Date time;


    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}