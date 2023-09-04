package com.qiyao.factory.resourceFactory2.resourceFactory.impl;

import com.qiyao.factory.factoryMethod.resourceFactory.IResourceLoader;
import com.qiyao.factory.resourceFactory2.product.impl.HttpResource;
import com.qiyao.factory.simpleFactory.Resource;

/**
 * @ClassName HttpResourceLoader
 * @Description Http 资源加载器
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/03
 */
public class HttpResourceLoader implements IResourceLoader {
    @Override
    public Resource load(String url) {
        // 此处省略中间复杂的处理流程
        return new Resource(url);
    }
}
