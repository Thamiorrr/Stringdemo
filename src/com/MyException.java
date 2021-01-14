package com;

public class MyException extends Throwable{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
