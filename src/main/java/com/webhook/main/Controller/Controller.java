package com.webhook.main.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhook")
public class Controller {
	
@PostMapping
public ResponseEntity<String> print(@RequestBody String requestbody)
{
	System.out.println("####### WebHook ######"+ requestbody);
	return new ResponseEntity<String>(requestbody,HttpStatus.OK);
}
}
