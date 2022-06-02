package ecommerceapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

 class printHello {
	@GetMapping(value="/hi")
	String displayMessage(){
		return "hello";
		
	}

}
