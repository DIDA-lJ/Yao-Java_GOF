package com.qiyao.abstractFactory.product.impl.defaultResource;

import com.qiyao.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

/**
 * @ClassName ClasspathTestResource
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class DefaultTextResource extends AbstractTextResource {
    public DefaultTextResource() {
    }

    public DefaultTextResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
