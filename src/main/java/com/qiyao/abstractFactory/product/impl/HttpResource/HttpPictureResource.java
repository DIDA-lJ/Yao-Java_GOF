package com.qiyao.abstractFactory.product.impl.HttpResource;

import com.qiyao.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

/**
 * @ClassName HttpPictureResource
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class HttpPictureResource extends AbstractPictureResource {
    public HttpPictureResource() {
    }

    public HttpPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
