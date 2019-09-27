package com.tangsir.common.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

@Data
public class BModel extends BaseRowModel {
    @ExcelProperty(value = "班级" ,index = 1)
    private String className;
    @ExcelProperty(value = "老师" ,index = 2)
    private String teacher;

    public BModel(String className, String teacher) {
        this.className = className;
        this.teacher = teacher;
    }
}
