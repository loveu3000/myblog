package com.tangsir.z_designmodel.Iterator.level_1;

import java.util.ArrayList;
import java.util.List;

/**
 * main
 *
 * @author tys on 2019/10/9
 */
public class App {
    public static void main(String[] args) {
        String[] ss = {"张一","张二","张三","张四","张五"};
        ArrayData arrayData = new ArrayData(ss);
        Iterator iterator = arrayData.getIterator();
        iterator.first();
        while(iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }

        List<String> list = new ArrayList<>();
        list.add("张1");
        list.add("张2");
        list.add("张3");
        list.add("张4");
        list.add("张5");
        ListData listData = new ListData(list);
        Iterator iterator1 = listData.getIterator();
        iterator1.first();
        while(iterator1.isDone()){
            System.out.println(iterator1.currentItem());
            iterator1.next();
        }

    }
}
