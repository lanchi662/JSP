package com.briup.jsp.service.impl;

import com.briup.jsp.bean.User;
import com.briup.jsp.dao.impl.UserDaoImpl;
import com.briup.jsp.service.IUserService;

public class UserServiceImpl implements IUserService{

	@Override
	public String registerUser(User user) {
		//ע��
		//�ж��û����Ƿ�ռ��
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		User user2=userDaoImpl.selectCustomerByName(user.getName());
		if(user2==null){
			//Ϊnull�Ļ���û��ע�� ִ��ע�����
			userDaoImpl.saveCustomer(user);
			return "ok";
		}else{
			return "error";
		}
		//������dao�����
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
