package com.qiyao.factory.resourceFactory2;

import com.qiyao.factory.exceptions.ResourceLoadException;
import com.qiyao.factory.resourceFactory2.product.AbstractResource;
import com.qiyao.factory.resourceFactory2.resourceFactory.IResourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static com.qiyao.factory.resourceFactory2.resourceFactory.ResourceConstant.COLON;


/**
 * @ClassName ResourceLoader
 * @Description 工厂方法实现资源加载
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/03
 */
public class ResourceLoader {
    /**
     * 缓存加载工厂接口
     */
    private IResourceLoader resourceLoader;
    /**
     * 资源加载缓存
     */
    private static Map<String, IResourceLoader> resourceLoaderCache = new HashMap<>(8);


    // 版本一和二共用代码，不够优雅，可以实现配置文件加载的方式
    //    static {
    //        resourceLoaderCache.put(HTTP, new HttpResourceLoader());
    //        resourceLoaderCache.put(FILE, new FileResourceLoader());
    //        resourceLoaderCache.put(CLASSPATH, new ClassPathResourceLoader());
    //        resourceLoaderCache.put(FTP, new FtpResourceLoader());
    //        resourceLoaderCache.put(DEFAULT, new HttpResourceLoader());
    //    }

    /**
     *  最终版本，加载配置文件到缓存中
     *     1.完全满足开闭原则，当最终扩充需求时，只需要新增实现和配置文件，不需要修改一行代码
     *     2.资源可以缓存吗？加入每次获取的资源是一样的，那缓存资源还有必要吗？
     */
    static {
        InputStream inputStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("resourceLoader2.properties");
        Properties properties = new Properties();

        try {
            properties.load(inputStream);

            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                String key = entry.getKey().toString();
                Class<?> clazz = Class.forName(entry.getValue().toString());
                IResourceLoader loader = (IResourceLoader) clazz.getConstructor().newInstance();


                // 遍历给 resourceLoaderCache 添加元素
                resourceLoaderCache.put(key, loader);
            }
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }


    }


    /**
     * @param url file:// http:// classpath:// ftp://
     * @return 实际的资源类
     */
    public AbstractResource load(String url) {
        // 1.需要根据 url 获取前缀
        String prefix = getPrefix(url);

        // 2.根据前缀选择不同的工厂，独立进行资源加载
        // 版本 1: 常规代码
//        if (HTTP.equals(prefix)) {
//            // .. 发起请求下载资源 .. 过程可能很复杂
//            resourceLoader = new HttpResourceLoader();
//        } else if (FILE.equals(prefix)) {
//            // .. 建立流、异常处理等
//            resourceLoader = new FileResourceLoader();
//        } else if (CLASSPATH.equals(prefix)) {
//            // ...
//            resourceLoader = new ClassPathResourceLoader();
//        } else {
//            resourceLoader = new DefaultResourceLoader();
//        }

        // 版本 2:获取加载方法
        resourceLoader = resourceLoaderCache.get(prefix);

        // 3.返回资源加载类
        return resourceLoader.load(url);
    }

    /**
     * 返回 url 前缀
     *
     * @param url 需要返回前缀的 url
     * @return url 前缀
     */
    private String getPrefix(String url) {
        // url 格式判断
        if (url == null || "".equals(url) || !COLON.contains(url)) {
            throw new ResourceLoadException("ResourceLoading exception: The url passed in is illegality");
        }
        String[] split = url.split(COLON);
        return split[0];
    }
}
