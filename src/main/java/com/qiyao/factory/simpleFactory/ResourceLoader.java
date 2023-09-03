package com.qiyao.factory.simpleFactory;

import com.qiyao.factory.exceptions.ResourceLoadException;

/**
 * @ClassName ResourceLoader
 * @Description 简单工厂实现资源加载
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/03
 */
public class ResourceLoader {
    /**
     * @param url file:// http:// classpath:// ftp://
     * @return 实际的资源类
     */
    public Resource load(String url) {
        // 1.需要根据 url 获取前缀
        String prefix = getPrefix(url);

        Resource resource = null;

        // 2.根据前缀处理不同的资源,并且返回
        return ResourceFactory.create(prefix,url);
    }

    /**
     * 返回 url 前缀
     *
     * @param url 需要返回前缀的 url
     * @return url 前缀
     */
    private String getPrefix(String url) {
        // url 格式判断
        if (url == null || "".equals(url) || !url.contains(":")) {
            throw new ResourceLoadException("ResourceLoading exception: The url passed in is illegality");
        }
        String[] split = url.split(":");
        return split[0];
    }
}
