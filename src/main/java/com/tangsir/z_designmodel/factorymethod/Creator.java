package com.tangsir.z_designmodel.factorymethod;

public abstract class Creator {
    /**
     * 创建product工厂的方法
     * @return 返回的product对象
     */
    protected abstract Product factoryMethod();

    public void someOperation(){
        //通常在这些方法实现中需要调用工厂方法来获取product对象
        Product factoryMethod = factoryMethod();
    }
}
