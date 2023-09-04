package com.qiyao.abstractFactory.product;

import java.io.InputStream;

/**
 * @ClassName Resource
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public interface Resource {
    /**
     * 返回 输入流
     *
     * @return InputStream
     */
    InputStream getInputStream();
}
