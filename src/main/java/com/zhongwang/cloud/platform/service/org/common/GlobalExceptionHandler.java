package com.zhongwang.cloud.platform.service.org.common;

import com.zhongwang.cloud.platform.service.org.exception.OrgControllerException;
import com.zhongwang.cloud.platform.service.org.exception.OrgServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Exception 处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({OrgServiceException.class})
    public ResponseEntity<Void> orgServiceException(Exception e) {
        return new ResponseEntity(((OrgServiceException) e).getCodeValue(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({OrgControllerException.class})
    public ResponseEntity<Void> orgControllerException(Exception e) {
        return new ResponseEntity(((OrgControllerException) e).getCodeValue(), HttpStatus.BAD_REQUEST);
    }

}
