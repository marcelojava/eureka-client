package com.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatingController {

	@Value("${server.port}")
	private Integer port;
	
	@RequestMapping(name="/greatings", method = RequestMethod.GET)
	public ResponseEntity<String> greatings() {
		String greating = "Estou sendo executado na porta " + port;
		return new ResponseEntity<>(greating, HttpStatus.OK);
	}
}
