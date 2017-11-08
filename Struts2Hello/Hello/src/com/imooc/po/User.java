package com.imooc.po;

import java.util.List;

public class User {
	public String username;
	public String password;
	public int age;
	public List<User> booklist;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public List<User> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<User> booklist) {
		this.booklist = booklist;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
