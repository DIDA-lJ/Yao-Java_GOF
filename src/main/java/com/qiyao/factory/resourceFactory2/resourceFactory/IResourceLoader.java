package com.qiyao.factory.resourceFactory2.resourceFactory;


import com.qiyao.factory.resourceFactory2.product.AbstractResource;

/**
 * @InterfaceName IResourceFactory
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/03
 */
public interface IResourceLoader {
    /**
     * 根据资源 url 进行资源加载
     *
     * @param url
     * @return
     */
    AbstractResource load(String url);

}
