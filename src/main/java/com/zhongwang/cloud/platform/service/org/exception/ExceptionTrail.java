package com.zhongwang.cloud.platform.service.org.exception;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

interface ExceptionTrail {

    String messageResourceBaseName();

    String moduleName();

    default MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:" + this.messageResourceBaseName());
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }
    
    default String errorCode(Enum<?> errorEnum) {
        return String.format("%s_%s", moduleName(), errorEnum.name().toUpperCase());
    }
}
