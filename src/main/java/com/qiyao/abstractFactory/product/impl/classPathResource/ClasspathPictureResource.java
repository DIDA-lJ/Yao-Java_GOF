package com.qiyao.abstractFactory.product.impl.classPathResource;

import com.qiyao.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

/**
 * @ClassName ClasspathPictureResource
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class ClasspathPictureResource extends AbstractPictureResource {
    public ClasspathPictureResource() {
    }

    public ClasspathPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
