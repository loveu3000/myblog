package com.tangsir.test.streamtest;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Student {
    private String name;
    private String age;
    private Integer score;
}
