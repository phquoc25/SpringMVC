package com.qph.common.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/movie")
public class MovieController {
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String getMovie(String name, ModelMap model) {
		return name;
	}
}
