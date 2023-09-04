package com.qiyao.abstractFactory.resourceFactory;

import com.qiyao.abstractFactory.product.AbstractPictureResource;
import com.qiyao.abstractFactory.product.AbstractTextResource;
import com.qiyao.abstractFactory.product.AbstractVideoResource;

/**
 * @ClassName IResourceLoader
 * @Description 每一个工厂实例，都可以生产一个产品族
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public interface IResourceLoader {
    /**
     * 加载图片资源的工厂方法
     * @param url 给定的资源url
     * @return 图片资源
     */
    AbstractPictureResource loadPictureResource(String url);

    /**
     * 加载视频资源的工厂方法
     * @param url 给定的资源url
     * @return 视频资源
     */
    AbstractVideoResource loadVideoResource(String url);

    /**
     * 加载文本资源的工厂方法
     *
     * @param url 给定的资源url
     * @return 文本资源
     */
    AbstractTextResource loadTestResource(String url);
}
