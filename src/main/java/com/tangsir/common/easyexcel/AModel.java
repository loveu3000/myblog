package com.tangsir.common.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

@Data
public class AModel extends BaseRowModel {
    @ExcelProperty(value = "名字" ,index = 1)
    private String name;
    @ExcelProperty(value = "年龄" ,index = 2)
    private String age;

    public AModel(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
