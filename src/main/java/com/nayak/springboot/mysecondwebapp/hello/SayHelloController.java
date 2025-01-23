package com.nayak.springboot.mysecondwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
@RequestMapping("say")
@ResponseBody
public String sayHello() {
	return "hello darling";
}
@RequestMapping("say-hello-jsp")

public String sayHelloJsp() {
	return "sayHello";
}
}
