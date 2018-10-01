package com.briup.jsp.service;

import com.briup.jsp.bean.User;

/*
 * 业务逻辑层
 * 业务逻辑功能 用户功能
 * 		注册
 * 		登陆
 * 		查看
 * 		修改
 * 		注销
 */
public interface IUserService {
	//注册
	String registerUser(User user);
	//登陆
	String loginUser(String name,String password);
	//查看
	User selectUserByName(String User);
	//修改
	void updateUser(User user);

}
