package com.cjc.demo.exceptionhandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cjc.demo.dto.ResponseDto;
import com.cjc.demo.exception.InvaliedCustomerId;



@RestControllerAdvice
public class CustomerExceptionHandler {
	
	@ExceptionHandler(InvaliedCustomerId.class)
	public ResponseEntity<ResponseDto> incorretCustomerId(InvaliedCustomerId e){
		ResponseDto rr = new ResponseDto(e.getMessage(), new Date());
		return new ResponseEntity<ResponseDto>(rr,HttpStatus.BAD_REQUEST);
	}


}
