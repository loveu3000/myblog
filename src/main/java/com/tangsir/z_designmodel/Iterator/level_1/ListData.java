package com.tangsir.z_designmodel.Iterator.level_1;

import java.util.List;

/**
 * List类聚合函数
 *
 * @author tys on 2019/10/9
 */
public class ListData extends Aggregation {

    /**
     * 集合类聚合函数
     */
    private List listdata = null;

    @Override
    public Iterator getIterator() {
        return new IteratorList(this);
    }

    public ListData (List listdata){
        this.listdata = listdata;
    }

    public Integer getSize(){
        return listdata.size();
    }

    public Object get(int index){
        return listdata.get(index);
    }
}
