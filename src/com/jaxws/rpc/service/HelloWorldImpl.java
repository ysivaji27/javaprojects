package com.jaxws.rpc.service;

import javax.jws.WebService;

//Service Implementation  
@WebService(endpointInterface = "com.jaxws.rpc.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS RPC " + name;
	}
}