package com.eumier.param;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/**
 * 
 * @author Jc
 *
 */
public class ParamsTemplet  extends HashMap {

	
	@SuppressWarnings("unused")
	private String id ;
	
	public ParamsTemplet(){
		
		id = UUID.randomUUID().toString();
	}
}
