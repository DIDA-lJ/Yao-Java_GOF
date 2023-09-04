package com.qiyao.factory.resourceFactory2.product.impl;

import com.qiyao.factory.resourceFactory2.product.AbstractResource;

import java.io.InputStream;

/**
 * @ClassName ClasspathResource
 * @Description ClasspathResource 资源处理器
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class ClasspathResource extends AbstractResource {

    public ClasspathResource() {
    }

    public ClasspathResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
