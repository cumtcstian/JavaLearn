<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="loginaction.action" method="post">
用户名：<input type="text" name="username"><s:fielderror name="username"></s:fielderror>
年龄：<input type="text" name="age">
密码<input type="password" name="password">
<input type="text" name="booklist[0].username">
<input type="text" name="booklist[1].username">

<input type="submit" name="提交">
</form>
</body>
</html>