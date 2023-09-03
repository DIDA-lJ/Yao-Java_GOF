package com.qiyao.factory.exceptions;

/**
 * @ClassName ResourceLoadException
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/03
 */
public class ResourceLoadException extends RuntimeException {
    private String message;

    public ResourceLoadException() {
        super();
    }

    public ResourceLoadException(String message) {
        super(message);
    }

    public ResourceLoadException(Throwable cause) {
        super(cause);
    }
}
