package com.imooc.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.print("ִ��Action");
		return SUCCESS;
		
		
	}
}
