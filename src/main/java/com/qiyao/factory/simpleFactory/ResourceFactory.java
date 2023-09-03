package com.qiyao.factory.simpleFactory;

import com.qiyao.factory.simpleFactory.Resource;

import static com.qiyao.factory.simpleFactory.ResourceConstant.*;

/**
 * @ClassName ResourceFactory
 * @Description 资源加载工厂，这里资源处理的步骤省略了一部分
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/03
 */
public class ResourceFactory {
    /**
     * 根据需求的类型以及 url 加载资源
     * @param type 资源类型
     * @param url  加载 url
     * @return
     */
    public static Resource create(String type, String url){
        if (HTTP.equals(type)) {
            // .. 发起请求下载资源 .. 过程可能很复杂
            return new Resource(url);
        } else if (FILE.equals(type)) {
            // .. 建立流、异常处理等
            return new Resource(url);
        } else if (CLASSPATH.equals(type)) {
            // ...
            return new Resource(url);
        } else {
            return new Resource("default");
        }
    }
}
