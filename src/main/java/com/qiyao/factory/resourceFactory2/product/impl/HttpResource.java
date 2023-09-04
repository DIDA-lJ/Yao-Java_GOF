package com.qiyao.factory.resourceFactory2.product.impl;

import com.qiyao.factory.resourceFactory2.product.AbstractResource;

import java.io.InputStream;

/**
 * @ClassName HttpResource
 * @Description HttpResource 资源处理器
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class HttpResource extends AbstractResource {

    public HttpResource() {
    }

    public HttpResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
