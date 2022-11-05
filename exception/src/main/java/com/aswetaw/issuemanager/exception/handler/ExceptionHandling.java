package com.aswetaw.issuemanager.exception.handler;

import com.aswetaw.issuemanager.common.response.ResponseHandler;
import com.aswetaw.issuemanager.exception.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @author Hein Htet Aung
 * @created at 05/11/2022
 **/
@RestControllerAdvice
@Slf4j
public class ExceptionHandling {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> notFoundException(NotFoundException exception){
        log.error("notFoundException happen! ",exception.getMessage());
        return ResponseHandler.createHttpResponse(exception.getMessage(),HttpStatus.NOT_FOUND);
    }
}
