package com.zemoso.logger;

public class MyOwnRuntimeException extends Exception {
    public MyOwnRuntimeException(String s) {
        System.out.println(s);
    }
}
