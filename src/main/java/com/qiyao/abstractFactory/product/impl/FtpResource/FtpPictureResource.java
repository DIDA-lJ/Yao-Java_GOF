package com.qiyao.abstractFactory.product.impl.FtpResource;

import com.qiyao.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

/**
 * @ClassName FtpPictureResource
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class FtpPictureResource extends AbstractPictureResource {
    public FtpPictureResource() {
    }

    public FtpPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
