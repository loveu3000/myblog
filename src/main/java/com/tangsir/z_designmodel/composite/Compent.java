package com.tangsir.z_designmodel.composite;

/**
 * 组合类和叶子类的抽象父类
 *
 * @author tys on 2019/10/9
 */
public abstract class Compent {
    /**打印方法
     * @param str 需要打印的缩进符号
     */
    public abstract void printStr(String str);

    /**增加节点
     * @param compent 节点对象
     */
    public void addChird(Compent compent){
        throw new UnsupportedOperationException("当前对象不支持此操作");
    }
    /**删除节点
     * @param compent 节点对象
     */
    public void delChird(Compent compent){
        throw new UnsupportedOperationException("当前对象不支持此操作");
    }
}
