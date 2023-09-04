package com.qiyao.abstractFactory.resourceFactory.impl;

import com.qiyao.abstractFactory.product.AbstractPictureResource;
import com.qiyao.abstractFactory.product.AbstractTextResource;
import com.qiyao.abstractFactory.product.AbstractVideoResource;
import com.qiyao.abstractFactory.resourceFactory.AbstractResourceLoader;

/**
 * @ClassName HttpResourceLoader
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class HttpResourceLoader extends AbstractResourceLoader {

    @Override
    public AbstractPictureResource loadPictureResource(String url) {
        return null;
    }

    @Override
    public AbstractVideoResource loadVideoResource(String url) {
        return null;
    }

    @Override
    public AbstractTextResource loadTestResource(String url) {
        return null;
    }
}