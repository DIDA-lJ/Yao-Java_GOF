package com.qiyao.abstractFactory.resourceFactory.impl;

import com.qiyao.abstractFactory.product.AbstractPictureResource;
import com.qiyao.abstractFactory.product.AbstractTextResource;
import com.qiyao.abstractFactory.product.AbstractVideoResource;
import com.qiyao.abstractFactory.product.impl.defaultResource.DefaultPictureResource;
import com.qiyao.abstractFactory.product.impl.defaultResource.DefaultTextResource;
import com.qiyao.abstractFactory.product.impl.defaultResource.DefaultVideoResource;
import com.qiyao.abstractFactory.resourceFactory.AbstractResourceLoader;

/**
 * @ClassName ClassPathResourceLoader
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class DefaultPathResourceLoader extends AbstractResourceLoader {
    @Override
    public AbstractPictureResource loadPictureResource(String url) {
        return new DefaultPictureResource(url);
    }

    @Override
    public AbstractVideoResource loadVideoResource(String url) {
        return new DefaultVideoResource(url);
    }

    @Override
    public AbstractTextResource loadTestResource(String url) {
        return new DefaultTextResource(url);
    }
}
