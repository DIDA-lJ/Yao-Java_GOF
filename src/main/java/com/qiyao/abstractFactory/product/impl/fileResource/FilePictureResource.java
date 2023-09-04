package com.qiyao.abstractFactory.product.impl.fileResource;

import com.qiyao.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

/**
 * @ClassName FilePictureResource
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public class FilePictureResource extends AbstractPictureResource {
    public FilePictureResource() {
    }

    public FilePictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
