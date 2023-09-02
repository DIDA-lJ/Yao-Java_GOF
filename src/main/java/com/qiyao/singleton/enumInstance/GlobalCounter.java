package com.qiyao.singleton.enumInstance;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 全局计数器枚举类:使用枚举类实现单例模式，线程安全
 */
public enum GlobalCounter {

    INSTANCE;
    private AtomicLong atomicLong = new AtomicLong(0);

    public Long getNumber() {
        return atomicLong.getAndIncrement();
    }
}
