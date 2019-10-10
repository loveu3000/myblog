package com.tangsir.z_designmodel.Iterator.level_1;

/**
 * 数组类聚合对象
 *
 * @author tys on 2019/10/9
 */
public class ArrayData extends Aggregation {

    /**
     * 数组对象
     */
    private String[] ss = null;

    /**
     * 获取迭代器接口
     * @return 返回迭代器对象
     */
    @Override
    public Iterator getIterator() {
        return new IteratorArray(this);
    }

    /**构造器
     * @param ss
     */
    public ArrayData(String[] ss){
        this.ss = ss;
    }

    /**获取数组长度
     * @return
     */
    public Integer getSize(){
        return ss.length;
    }

    /**根据下标获取值
     * @param index 下标
     * @return
     */
    public Object get(int index){
        Object object = null;
        for(int i = 0;i<ss.length;i++){
            if(i==index)
                object = ss[i];
        }
        return object;
    }
}
