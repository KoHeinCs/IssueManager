package com.aswetaw.issuemanager.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Hein Htet Aung
 * @created at 28/10/2022
 **/
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HttpResponseDTO<T> {
    private T data;
    private int httpStatusCode;
    private HttpStatus httpStatus;
    private String message;
    private LocalDateTime localDateTime;

    public HttpResponseDTO(T data) {
        this.data = data;
        this.localDateTime = LocalDateTime.now();
    }

    public HttpResponseDTO(T data, String message) {
        this(data);
        this.message = message;
    }

    public HttpResponseDTO(T data, String message,HttpStatus httpStatus) {
        this(data,message);
        this.httpStatusCode = httpStatus.value();
        this.httpStatus = httpStatus;

    }

    public HttpResponseDTO(String message,HttpStatus httpStatus) {
        this.message = message;
        this.httpStatusCode = httpStatus.value();
        this.httpStatus = httpStatus;

    }


}
