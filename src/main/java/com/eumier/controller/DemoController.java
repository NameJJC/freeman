package com.eumier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.eumier.param.ParamsTemplet;
import com.eumier.service.DemoService;

/**
 * 
 * @author Jc
 *
 */

@Controller("Demo")
public class DemoController {

	@Autowired
	DemoService  demoService;
	
	@PostMapping("/DemoInsert")
	public ModelAndView DemoInsert(String username ,String password){
		
		ParamsTemplet  params =  new ParamsTemplet();  //之后这里还会在封装一次 暂时
		
		params.put("username", "admin");
		params.put("password", "gotoapp");
		
		demoService.demoInsert(params);
		
		return  new ModelAndView("index");
	}
	
	@PostMapping("/DemoInsertBody")
	@ResponseBody
	public ModelAndView DemoInsertToBody(String username ,String password){
		
		ParamsTemplet  params =  new ParamsTemplet();  //之后这里还会在封装一次 暂时
		
		params.put("username", "admin");
		params.put("password", "gotoapp");
		
		demoService.demoInsert(params);
		
		return null;
	}
}
