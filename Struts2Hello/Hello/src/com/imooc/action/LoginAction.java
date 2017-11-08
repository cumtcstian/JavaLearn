package com.imooc.action;

import com.imooc.po.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport 
implements ModelDriven<User>{

	/*public String username;
	public String password;*/
	
	/*private User huser;
	public User getHuser() {
		return huser;
	}
	public void setHuser(User huser) {
		this.huser = huser;
	}*/
	private User huser = new User();

	public String Login(){
		/*if(huser.getUsername()==null || huser.getUsername().equals("")){
			//注意此处验证如果表单错误。自动返回该视图
			this.addFieldError("username", "用户名不能为空！！！");
			return INPUT;
		}*/
		
		System.out.println(huser.getUsername());
		System.out.println(huser.getBooklist().get(0).getUsername());
		System.out.println(huser.getBooklist().get(1).getUsername());
		return SUCCESS;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return huser;
	}

	@Override
	public void validate() {
		if(huser.getUsername()==null || huser.getUsername().equals("")){
			//注意此处验证如果表单错误。自动返回该视图
			this.addFieldError("username", "用户名不能为空！！！");
			//return INPUT; 校验逻辑如果是在 validate方法中则不需要写这一行
		}
	}
	
	
}
