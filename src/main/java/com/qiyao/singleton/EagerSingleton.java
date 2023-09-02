package com.qiyao.singleton;

/**
 * <p>
 *  全局分析
 *  1.创建对象本身的复杂度
 *   ·很多单例对象创建的过程可能极其复杂
 *   ·很多单例对象创建完成后会占用很大的内存，比如缓存对象
 *   ·很多单例对象创建完成后可能很小而且很简单
 * </p>
 * @ClassName EagerSingletion
 * @Description 饿汉式单例模式实现
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/02
 */
public class EagerSingleton {
    /**
     * 1.持有一个 JVM 全局唯一的单例
     */
    private static EagerSingleton instance = new EagerSingleton();

    /**
     * 2. 为了避免别人随意创建，需要私有化构造器
     */
    private EagerSingleton() {
    }

    /**
     * 3. 暴露一个公共的方法获取单例对象的接口
     *
     * @return EagerSingletion 单例对象
     */
    public static EagerSingleton getInstance() {
        return instance;
    }
}
