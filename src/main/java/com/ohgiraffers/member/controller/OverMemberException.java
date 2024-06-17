package com.ohgiraffers.member.controller;

public class OverMemberException extends Exception {
    public OverMemberException() {
        super();
    }

    public OverMemberException(String message) {
        super(message);
    }

    public OverMemberException(String message, Throwable cause) {
        super(message, cause);
    }

    public OverMemberException(Throwable cause) {
        super(cause);
    }

    protected OverMemberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
