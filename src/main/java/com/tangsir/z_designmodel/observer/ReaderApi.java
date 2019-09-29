package com.tangsir.z_designmodel.observer;

/**
 * 读者接口，观察者
 */
public interface ReaderApi {
    /**
     * 修改状态
     * @param subject
     */
    public void updateStatus(Subject subject);
}
