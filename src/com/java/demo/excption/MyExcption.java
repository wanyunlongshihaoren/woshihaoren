package com.java.demo.excption;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExcption {
	private static Logger log = Logger.getLogger(MyExcption.class);
@ExceptionHandler(Exception.class)
	public String myExcption(Exception ex) {
	log.debug(ex.getMessage());
		System.out.println(ex);
		return "error.jsp";
	}
}
