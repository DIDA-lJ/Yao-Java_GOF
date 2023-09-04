package com.qiyao.factory.factoryMethod.resourceFactory;

import com.qiyao.factory.simpleFactory.Resource;

/**
 * @InterfaceName IResourceFactory
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/03
 */
public interface IResourceLoader {

    Resource load(String url);

}
