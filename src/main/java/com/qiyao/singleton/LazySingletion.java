package com.qiyao.singleton;

/**
 * <p>
 * 简单的懒汉式单例模式线程不安全
 * 面试高频率的考点：如何解决懒汉式单例设计模式线程安全问题？
 * 1.暴露的实例返回接口加 synchronized ,但是可能会影响性能
 * 2.双重检查锁机制实现，Spring 三级缓存中使用到了双重检查锁机制
 * </p>
 *
 * @ClassName LazySingletion
 * @Description 懒汉式，懒加载（Synchronized）实现单例模式
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/02
 */
public class LazySingletion {
    /**
     * 1.持有一个 JVM 全局唯一的实例
     */
    private static LazySingletion instance;

    /**
     * 2.为了避免别人随意地创建，我们需要私有化构造器
     */
    private LazySingletion() {

    }

    /**
     * 3.暴露一个方法，用来获取实例
     */
    public synchronized static LazySingletion getInstance() {
        if (instance == null) {
            instance = new LazySingletion();
        }
        return instance;
    }
}
