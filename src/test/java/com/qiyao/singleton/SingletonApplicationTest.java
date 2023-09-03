package com.qiyao.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class SingletonApplicationTest {
    @Test
    public void testReflect() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class<DoubleCheckLockSingleton> clazz = DoubleCheckLockSingleton.class;
        Constructor<DoubleCheckLockSingleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        boolean flag = DoubleCheckLockSingleton.getInstance() == constructor.newInstance();

        log.info("flag -->{}", flag);
    }

    @Test
    public void testSerialize() throws IOException, ClassNotFoundException {
        //获取单例序列化
        DoubleCheckLockSingleton singleton = DoubleCheckLockSingleton.getInstance();

        FileOutputStream fout = new FileOutputStream("D:\\code\\core-project\\Yao-Java_GOF\\src\\main\\resources\\test\\test.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(singleton);
        // 将实例反序列化出来
        FileInputStream fin = new FileInputStream("D:\\code\\core-project\\Yao-Java_GOF\\src\\main\\resources\\test\\test.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        Object o = in.readObject();
        log.info("是否是同一个实例:{}", o == singleton);
    }

    @Test
    public void testRuntime() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process exec = runtime.exec("ping 127.0.0.1");
        InputStream inputStream = exec.getInputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = inputStream.read(buffer)) > 0) {
            System.out.println(new String(buffer, 0, len, Charset.forName("GBK")));
        }
        long maxMemory = runtime.maxMemory();
        log.info("maxMemory ---> {}", maxMemory);
    }


    @Test
    public void testLogger(){
        // logger 创建对象
        Logger qiyao = LoggerFactory.getLogger("qiyao");
        Logger qiyao2 = LoggerFactory.getLogger("qiyao");
        Logger logger = LoggerFactory.getLogger("qiyao-logger");

        // 同一个类的日志基本一致，不同类的一致可能存在不同
        log.info("qiyao == qiyao2 --> {}",qiyao == qiyao2);
        log.info("qiyao == logger --> {}",qiyao == logger);
    }
}