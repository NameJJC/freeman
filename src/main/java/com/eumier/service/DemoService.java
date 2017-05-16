package com.eumier.service;

import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoService  {
	
	public void test(){
		
		System.out.print("Spring加载测试成功！");
	}
}
