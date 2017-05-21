package com.eumier.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eumier.dao.SqlSessionHandler;
import com.eumier.param.ParamsTemplet;
/**
 * 
 * @author jcJinag
 * @param <V>
 * @from  2017-5-21 14:34:53
 */
@Service("demoService")
public class DemoService  {
	
	@Autowired
	private SqlSessionHandler  sqlHandler;
	
	public void test(){
		
		System.out.print("Spring加载测试成功！");
	}
	
	public void demoInsert(ParamsTemplet params){
		
		sqlHandler.insert("Demo.insertDemo", params); //staement  写 mybatis 配置文件里对应的sql ID
	}
}
