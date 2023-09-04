package com.qiyao.abstractFactory.resourceFactory.impl;

import com.qiyao.abstractFactory.product.AbstractPictureResource;
import com.qiyao.abstractFactory.product.AbstractTextResource;
import com.qiyao.abstractFactory.product.AbstractVideoResource;
import com.qiyao.abstractFactory.product.impl.classPathResource.ClasspathPictureResource;
import com.qiyao.abstractFactory.product.impl.classPathResource.ClasspathTextResource;
import com.qiyao.abstractFactory.product.impl.classPathResource.ClasspathVideoResource;
import com.qiyao.abstractFactory.resourceFactory.AbstractResourceLoader;

/**
 * @ClassName ClassPathResourceLoader
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class ClassPathResourceLoader  extends AbstractResourceLoader {
    @Override
    public AbstractPictureResource loadPictureResource(String url) {
        return new ClasspathPictureResource(url);
    }

    @Override
    public AbstractVideoResource loadVideoResource(String url) {
        return new ClasspathVideoResource(url);
    }

    @Override
    public AbstractTextResource loadTestResource(String url) {
        return new ClasspathTextResource(url);
    }
}
