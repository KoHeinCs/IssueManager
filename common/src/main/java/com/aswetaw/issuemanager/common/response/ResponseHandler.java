package com.aswetaw.issuemanager.common.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hein Htet Aung
 * @created at 28/10/2022
 **/
public class ResponseHandler {
    private static Map<String,Object> response = new HashMap<>();

    public static  <T> ResponseEntity<Object> createHttpResponse( T object, String message,HttpStatus httpStatus){
        HttpResponseDTO responseDTO = new HttpResponseDTO(object,message,httpStatus);
        response.put("response",responseDTO);
        return new ResponseEntity<>(response,httpStatus);
    }

    public static  <T> ResponseEntity<Object> createHttpResponse(String message,HttpStatus httpStatus){
        HttpResponseDTO responseDTO = new HttpResponseDTO(message,httpStatus);
        response.put("response",responseDTO);
        return new ResponseEntity<>(response,httpStatus);
    }


}
