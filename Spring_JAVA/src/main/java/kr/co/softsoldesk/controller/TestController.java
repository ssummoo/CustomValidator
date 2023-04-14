package kr.co.softsoldesk.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.validator.DataBeanValidator;


@Controller
public class TestController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DataBeanValidator validator1=new DataBeanValidator();
		binder.setValidator(validator1); // 하나일때
		//binder.addValidators(validator1,validator2,validator3); 여러개일때
	}
	@GetMapping("/input_data")
	public String input_data(DataBean dataBean) {
		
		return "input_data";
	}
	
	@PostMapping("/input_pro")
	public String input_pro(@Valid DataBean dataBean, BindingResult result) {
		
		if(result.hasErrors()) {
			return "input_data";
		}
		
		return "input_success";
	}
	
}