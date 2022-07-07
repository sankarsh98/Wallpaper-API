package com.wallpaper.app.saver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This class is responsible for handling api methods
@RestController
public class ResponseSaver {
	
	
	//@RequestMapping says which method does what
	//Default method is get
	@RequestMapping("/saver")
	public String saver() {
		return "I will be saving in some time!!!";
	}
}

