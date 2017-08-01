package com.xq.dz.helloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Hello world!
 *
 */
@Controller
@RequestMapping("/hello")
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	@RequestMapping(value = "/world", method = RequestMethod.GET)
	public String world() {
		System.out.println("Hello World!");
		return "helloWorld";
	}
}
