package com.qiyao.abstractFactory.product.impl.defaultResource;

import com.qiyao.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

/**
 * @ClassName DefaultPictureResource
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class DefaultPictureResource extends AbstractPictureResource {
    public DefaultPictureResource() {
    }

    public DefaultPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
