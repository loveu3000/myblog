package com.tangsir.z_designmodel.Iterator.level_1;

/**
 * 迭代器接口实现类
 *
 * @author tys on 2019/10/9
 */
public class IteratorList implements Iterator {
    /**
     * 需要迭代的对象
     */
    private ListData listData;

    /**
     * 内部索引，记录当前迭代的索引位置 -1 表示刚开始的时候，迭代器指向聚合对象第一对象之前
     */
    private int index = -1;

    /**构造迭代器
     * @param listData 需要被迭代的对象
     */
    public IteratorList(ListData listData){
        this.listData = listData;
    }



    @Override
    public void first() {
        this.index = 0;
    }

    @Override
    public void next() {
        if(index < this.listData.getSize()){
            index = index + 1;
        }
    }

    @Override
    public boolean isDone() {
        if(index == this.listData.getSize())
            return false;
        return true;
    }

    @Override
    public Object currentItem() {
        return this.listData.get(index);
    }
}
