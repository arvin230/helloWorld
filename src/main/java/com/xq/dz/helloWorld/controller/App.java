package com.xq.dz.helloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Hello world!
 *
 */
@Controller
@RequestMapping("/hello")
public class App {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/world", method = RequestMethod.GET)
	public String hello(@RequestParam String name, Model model) {
		model.addAttribute("name", name);
		return "helloWorld";
	}
}
