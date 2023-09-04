package com.qiyao.abstractFactory.product.impl.FtpResource;

import com.qiyao.abstractFactory.product.AbstractVideoResource;

import java.io.InputStream;

/**
 * @ClassName ClasspathVideoResource
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class FtpVideoResource extends AbstractVideoResource {
    public FtpVideoResource() {
    }

    public FtpVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
