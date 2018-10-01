package com.briup.jsp.service.impl;

import com.briup.jsp.bean.User;
import com.briup.jsp.dao.impl.UserDaoImpl;
import com.briup.jsp.service.IUserService;

public class UserServiceImpl implements IUserService{

	@Override
	public String registerUser(User user) {
		//注册
		//判断用户名是否被占用
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		User user2=userDaoImpl.selectCustomerByName(user.getName());
		if(user2==null){
			//为null的话就没有注册 执行注册操作
			userDaoImpl.saveCustomer(user);
			return "ok";
		}else{
			return "error";
		}
		//借助于dao层代码
	}

	@Override
	public String loginUser(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectUserByName(String User) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
