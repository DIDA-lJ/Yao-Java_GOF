package com.qiyao.abstractFactory.product;

import java.io.InputStream;

/**
 * @ClassName AbstractPictureResource
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public abstract class AbstractPictureResource implements Resource{
    /**
     * 图片的一些公用的成员变量，方法都可以定义在这个类中
     */
    private String url;


    public AbstractPictureResource() {
    }

    public AbstractPictureResource(String url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
