package com.qiyao.singleton.enumInstance;

/**
 * 使用枚举实现单例
 */
public enum Season {
    // 这个 Spring 是单例
    // 对于枚举类，任何一个枚举项就是一个天然的单例
    // 本质上就是 static final Season spring = new Season();
    SPRING,
}
