package com.qiyao.abstractFactory.product.impl.classPathResource;

import com.qiyao.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

/**
 * @ClassName ClasspathTestResource
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class ClasspathTextResource extends AbstractTextResource {
    public ClasspathTextResource() {
    }

    public ClasspathTextResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
