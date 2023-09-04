package com.qiyao.resourceFactory2;

import com.qiyao.factory.resourceFactory2.ResourceLoader;
import com.qiyao.factory.resourceFactory2.product.AbstractResource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @ClassName FactoryMethodTest
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
@Slf4j
public class FactoryMethodTest {

    @Test
    public void testFactoryMethod() {
        String url = "file:D:\\code\\core-project\\Yao-Java_GOF\\src\\main\\resources\\test\\test.txt";
        ResourceLoader resourceLoader = new ResourceLoader();
        AbstractResource resource = resourceLoader.load(url);
        log.info("resource ---> {}", resource.getClass().getName());

    }
}
