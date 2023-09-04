package com.qiyao.factory.resourceFactory2.product;

import java.io.InputStream;

/**
 * @InterfaceName IResource
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/04
 */
public abstract class AbstractResource {
     private String url;

     public AbstractResource(String url) {
          this.url = url;
     }

     public AbstractResource(){

     }

     /**
      * 共享方法实现,仅限子类访问
      */
     protected void shared(){
          System.out.println("共享方法");
     }


     /**
      * 每个子类需要独自实现的方法
      * @return字节流
      */
     public abstract InputStream getInputStream();
}
