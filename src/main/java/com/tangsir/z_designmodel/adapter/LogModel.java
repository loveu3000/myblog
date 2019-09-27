package com.tangsir.z_designmodel.adapter;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class LogModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private String logId;
    private String operateUser;
    private String operateTime;
    private String logContent;

}
