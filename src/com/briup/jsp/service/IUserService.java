package com.briup.jsp.service;

import com.briup.jsp.bean.User;

/*
 * ҵ���߼���
 * ҵ���߼����� �û�����
 * 		ע��
 * 		��½
 * 		�鿴
 * 		�޸�
 * 		ע��
 */
public interface IUserService {
	//ע��
	String registerUser(User user);
	//��½
	String loginUser(String name,String password);
	//�鿴
	User selectUserByName(String User);
	//�޸�
	void updateUser(User user);

}
