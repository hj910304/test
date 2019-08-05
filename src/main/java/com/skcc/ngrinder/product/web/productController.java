package com.skcc.ngrinder.product.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.ngrinder.product.vo.productVo;

@RestController
@RequestMapping("/test")
public class productController {
	
	@RequestMapping("/tt")
	public @ResponseBody String test() {
		return "test"; 
	}
	
	@RequestMapping("/test")
	public @ResponseBody String tr() {
		return "ttt"; 
	}
	
	@RequestMapping("/getAll")
	public @ResponseBody productVo getAll() {
		productVo product = null;
		return product;
	}
	
	@GetMapping("/id/{id}")
	public @ResponseBody String getId(@PathVariable("id") String prodId) {
		return prodId; 
	}
}
