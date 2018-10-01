package com.briup.jsp.dao;

import java.util.List;
import com.briup.jsp.bean.User;

public interface IUserDao {
	void saveCustomer(User user);
	void deleteCustomer(User user);
	void updateCustomer(User user);
	User selectCustomerByName(String name);
	List<User>selectAllCustomer();

}
