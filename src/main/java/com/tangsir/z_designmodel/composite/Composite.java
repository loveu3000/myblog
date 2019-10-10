package com.tangsir.z_designmodel.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合类对象
 *
 * @author tys on 2019/10/9
 */
public class Composite extends Compent {

    private List<Compent> compents = new ArrayList<>();
    @Override
    public void printStr(String str) {
        System.out.println();
    }
}
