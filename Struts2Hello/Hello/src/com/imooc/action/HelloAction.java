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
    //����ȫ��ʹ�� servlet api  
    private HttpServletRequest request;  
    private HttpServletResponse response;  
    private ServletContext context;  
  
    public String add(){		
		//return SUCCESS;
    	System.out.print("ִ��Action2");
    	request.setAttribute("path", "update");
		return "add";
	}
    
    public String update() {		
		//return SUCCESS;
    	System.out.print("ִ��Action1");
    	return "update";
	}
    
   
    
    @Override
	public String execute() throws Exception {
		System.out.print("ִ��Action");
		return SUCCESS;
		
		
	}
    
    /** 
     *  ʵ�ֽӿڷ��� 
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
  
    
    //��δ�����û���õ���
    public String login()  {  
        //ֱ��ʹ��request  
        Object username = request.getParameter("username");  
        Object password = request.getParameter("password");  
        if(username != null && password != null)  
        {  
            if("jack".equals(username)&&"jack".equals(password))  
            {  
                //���session  
                HttpSession session = request.getSession();  
                session.setAttribute("username",username);  
                return  "success";  
            }  
            else  
            {  
                try  
                {  
                    //ֱ��ʹ��response  
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
                //ֱ��ʹ��  
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
