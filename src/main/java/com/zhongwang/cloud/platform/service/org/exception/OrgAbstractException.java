package com.zhongwang.cloud.platform.service.org.exception;

import java.util.Locale;

public abstract class OrgAbstractException extends Exception implements ExceptionTrail {
    
    private static final long serialVersionUID = 1L;
    private Enum<?> code;
    private String codeValue;
    private Object[] arguments;

    public OrgAbstractException(Enum<?> code) {
        this.code = code;
        this.codeValue = errorCode(code);
    }

    public OrgAbstractException(Enum<?> code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.codeValue = errorCode(code);
    }

    public OrgAbstractException(Enum<?> code, String message) {
        super(message);
        this.code = code;
        this.codeValue = errorCode(code);
    }

    public OrgAbstractException(Enum<?> code, String message, Object... arguments) {
        super(message);
        this.code = code;
        this.codeValue = errorCode(code);
        this.arguments = arguments;
    }

    public OrgAbstractException(Enum<?> code, String message, Throwable cause, Object... arguments) {
        super(message, cause);
        this.code = code;
        this.codeValue = errorCode(code);
        this.arguments = arguments;
    }

    public OrgAbstractException(Enum<?> code, Throwable cause) {
        super(cause);
        this.code = code;
        this.codeValue = errorCode(code);
    }

    public OrgAbstractException(String code) {
        this.codeValue = code;
    }

    public OrgAbstractException(String code, String message) {
        super(message);
        this.codeValue = code;
    }

    public OrgAbstractException(String code, String message, Object... arguments) {
        super(message);
        this.codeValue = code;
        this.arguments = arguments;
    }

    protected void setCode(Enum<?> code) {
        this.code = code;
        this.codeValue = errorCode(code);
    }

    protected void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    protected void setArguments(Object... arguments) {
        this.arguments = arguments;
    }

    @SuppressWarnings("unchecked")
    public <C extends Enum<C>> C getCode() {
        return (C) code;
    }

    public String getCodeValue() {
        return codeValue;
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        return message == null ? codeValue : message;
    }

    @Override
    public String getLocalizedMessage() {
        return messageSource().getMessage(codeValue, arguments, super.getLocalizedMessage(), Locale.getDefault());
    }

}
