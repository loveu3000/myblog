package com.tangsir.z_designmodel.Iterator.level_1;

/**
 * 迭代器接口
 *
 * @author tys on 2019/10/9
 */
public interface Iterator {
    /**
     * 移动到聚合对象第一个位置
     */
    public void first();

    /**
     * 移动到下一个位置
     */
    public void next();

    /**判断是否移动到最后一个位置
     * @return
     */
    public boolean isDone();

    /**获取迭代的当前元素
     * @return
     */
    public Object currentItem();
}
