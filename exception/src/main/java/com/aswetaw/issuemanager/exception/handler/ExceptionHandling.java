package com.aswetaw.issuemanager.exception.handler;

import com.aswetaw.issuemanager.common.constant.MessageConstant;
import com.aswetaw.issuemanager.common.response.ResponseHandler;
import com.aswetaw.issuemanager.exception.NotFoundException;
import com.aswetaw.issuemanager.exception.constant.ExceptionConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;


/**
 * @author Hein Htet Aung
 * @created at 05/11/2022
 **/
@RestControllerAdvice
@Slf4j
public class ExceptionHandling {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> notFoundException(NotFoundException exception){
        log.error("not found exception happen! ",exception.getMessage());
        return ResponseHandler.createHttpResponse(exception.getMessage(),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> notFoundException(Exception exception){
        log.error("internal server error happen! ",exception.getMessage());
        return ResponseHandler.createHttpResponse(ExceptionConstant.INTERNAL_SERVER_ERROR_MSG,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<Object> methodNotSupportedException(HttpRequestMethodNotSupportedException exception) {
        log.error("method not supported exception happen! ", exception.getMessage());
        HttpMethod supportedMethod = Objects.requireNonNull(exception.getSupportedHttpMethods()).iterator().next();
        return ResponseHandler.createHttpResponse(String.format(ExceptionConstant.METHOD_IS_NOT_ALLOWED, supportedMethod),HttpStatus.INTERNAL_SERVER_ERROR);
    }




}
