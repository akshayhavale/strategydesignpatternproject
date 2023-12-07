package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.services.ApplicationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/apptype")
@RequiredArgsConstructor
public class ApplicationTypeController {
	
	private static final Logger logger = LoggerFactory.getLogger(ApplicationTypeController.class);
	
	private final ApplicationService applicationService;
	
	@PostMapping(value = "/{type}")
	public @ResponseBody String upgradeApp(@PathVariable(value = "type", required = true) String type){
		logger.debug("inside apptypecontrller upgradeApp method");
		return applicationService.upgrade(type);
	} 

}
