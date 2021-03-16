package com.jaxws.doc.service;

import javax.jws.WebService;

//Service Implementation  
@WebService(endpointInterface = "com.jaxws.doc.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS DOC " + name;
	}
}