package com.qiyao.factory.resourceFactory2.product.impl;

import com.qiyao.factory.resourceFactory2.product.AbstractResource;

import java.io.InputStream;

/**
 * @ClassName FtpResource
 * @Description FtpResource 资源处理器
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class FtpResource extends AbstractResource {

    public FtpResource() {
    }

    public FtpResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
