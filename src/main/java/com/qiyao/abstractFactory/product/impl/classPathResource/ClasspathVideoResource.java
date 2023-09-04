package com.qiyao.abstractFactory.product.impl.classPathResource;

import com.qiyao.abstractFactory.product.AbstractVideoResource;

import java.io.InputStream;

/**
 * @ClassName ClasspathVideoResource
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class ClasspathVideoResource extends AbstractVideoResource {
    public ClasspathVideoResource() {
    }

    public ClasspathVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
