package com.qiyao.factory.factoryMethod.impl;

import com.qiyao.factory.factoryMethod.IResourceLoader;
import com.qiyao.factory.simpleFactory.Resource;

/**
 * @ClassName HttpResourceLoader
 * @Description FileResourceLoader 资源加载器
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/03
 */
public class FileResourceLoader implements IResourceLoader {
    @Override
    public Resource load(String url) {
        // 此处省略中间复杂的处理流程
        return new Resource(url);
    }
}
