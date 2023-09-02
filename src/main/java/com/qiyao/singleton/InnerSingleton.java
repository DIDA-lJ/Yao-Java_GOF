package com.qiyao.singleton;

/**
 * @ClassName InnerSingleton
 * @Description 静态内部类实现
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/02
 */
public class InnerSingleton {
    /**
     * 1.构造方法私有化
     */
    private InnerSingleton() {

    }

    /**
     * 2.提供一个方法获取单例对象
     */
    public InnerSingleton getInstance() {
        return InnerSingletonHolder.instance;
    }

    /**
     * 3.定义内部类来持有实例
     * 特性：类加载的时机 ---> 一个类会在第一次主动使用的时候被加载
     * 实例会在内部类加载 (调用 getInstance 方法的时候) 会创建
     */
    private static class InnerSingletonHolder {
        private static final InnerSingleton instance = new InnerSingleton();
    }

}
