package com.qiyao.singleton;

/**
 * <p>
 * 简单的懒汉式单例模式线程不安全
 * 面试高频率的考点：如何解决懒汉式单例设计模式线程安全问题？
 *  1.暴露的实例返回接口加 synchronized ,但是可能会影响性能
 *  2.双重检查锁机制实现，Spring 三级缓存中使用到了双重检查锁机制
 * </p>
 *
 * @ClassName LazySingletion
 * @Description 懒汉式，懒加载（双重检查锁）实现单例模式
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/02
 */
public class DoubleCheckLockSingleton {
    /**
     * 1.持有一个 JVM 全局唯一的实例
     * 创建对象的时候，由于创建过程不是原子性的操作，所以即使使用了双重检查锁，其在创建过程中是否可能会产生半初始化状态
     * volatile 1.保证内存可见 2.保证有序性
     * 事实上，1.9 以上,不加 volatile 也可以， jvm 内部处理有序性
     */
    private static volatile DoubleCheckLockSingleton instance;

    /**
     * 2.为了避免别人随意地创建，我们需要私有化构造器
     */
    private DoubleCheckLockSingleton() {

    }

    /**
     * 3.暴露一个方法，用来获取实例
     *  第一次创建需要上锁，一旦创建好了，就释放锁
     *  事实上,获取单例并没有线程安全问题
     */
    public static DoubleCheckLockSingleton getInstance() {
        if (instance == null) {
            // 单加一把锁可能没用
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
