package com.wangyin.ak47.core.stub;

import com.wangyin.ak47.core.handler.HandlerInitializer;

/**
 * Stub base
 * 
 * @author wyhanyu
 * 
 * @param <Q>
 * @param <R>
 */
public interface Stub<Q, R> {

    /**
     * 设置监听端口
     * 
     * @param port
     *            监听端口
     */
    public void setPort(int port);
    
    
    /**
     * 设置超时，单位毫秒
     * 
     * @param timeoutMillis
     */
//    public void setTimeoutMillis(int timeoutMillis);


    /**
     * 启动server，开启服务。
     * 
     * @return
     */
    public void start() throws Exception;

    /**
     * hold住，一直运行。
     * 
     * @return
     * @throws Exception
     */
    public void hold() throws Exception;

    
    /**
     * 停止服务
     * 
     * @return
     */
    public void stop() throws Exception;

    /**
     * 关闭所有可能的服务，释放所有的资源，不可再用。
     */
    public void release();



    /**
     * 添加PipeInitializer
     * 
     * @param pipeInit
     */
    public void userInitializer(HandlerInitializer<R, Q> userInitializer);

}
