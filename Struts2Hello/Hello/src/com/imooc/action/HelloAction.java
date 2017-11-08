package com.imooc.action;

import org.apache.struts2.interceptor.ServletRequestAware;  
import org.apache.struts2.interceptor.ServletResponseAware;  
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.ServletContext;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
import java.io.IOException;  
  
public class HelloAction extends ActionSupport implements ServletRequestAware,  
        ServletResponseAware,ServletContextAware  
{  
    //设置全局使用 servlet api  
    private HttpServletRequest request;  
    private HttpServletResponse response;  
    private ServletContext context;  
  
    public String add(){		
		//return SUCCESS;
    	System.out.print("执行Action2");
    	request.setAttribute("path", "update");
		return "add";
	}
    
    public String update() {		
		//return SUCCESS;
    	System.out.print("执行Action1");
    	return "update";
	}
    
   
    
    @Override
	public String execute() throws Exception {
		System.out.print("执行Action");
		return SUCCESS;
		
		
	}
    
    /** 
     *  实现接口方法 
     */  
    @Override  
    public void setServletRequest(HttpServletRequest request) {  
        this.request = request;  
    }  
  
    @Override  
    public void setServletResponse(HttpServletResponse response) {  
        this.response = response;  
    }  
  
    @Override  
    public void setServletContext(ServletContext context) {  
        this.context = context;  
    }  
  
    
    //这段代码是没有用到的
    public String login()  {  
        //直接使用request  
        Object username = request.getParameter("username");  
        Object password = request.getParameter("password");  
        if(username != null && password != null)  
        {  
            if("jack".equals(username)&&"jack".equals(password))  
            {  
                //获得session  
                HttpSession session = request.getSession();  
                session.setAttribute("username",username);  
                return  "success";  
            }  
            else  
            {  
                try  
                {  
                    //直接使用response  
                    response.getWriter().write("failed");  
                }  
                catch (IOException e)  
                {  
                    e.printStackTrace();  
                }  
                return  null;  
            }  
        }  
        else  
        {  
            try  
            {  
                //直接使用  
                response.getWriter().write("check input");  
            }  
            catch (IOException e)  
            {  
                e.printStackTrace();  
            }  
            return null;  
        }  
    }  
} 
