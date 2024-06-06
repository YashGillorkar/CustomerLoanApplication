package com.cjc.demo.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDto {

	private String msg;
	private Date timestamp;
}
