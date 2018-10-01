package com.briup.jsp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.briup.jsp.bean.User;
import com.briup.jsp.dao.IUserDao;
import com.briup.jsp.utils.ConnectionFactory;

public class UserDaoImpl implements IUserDao{
	
	@Override
	public void saveCustomer(User user) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try {
			 connection=ConnectionFactory.getConnection();
			//System.out.println(connection);
			//获取PreparedStatement对象
			String sql="insert into s_jdbc(id,name,password,zip,address,telephone,email) values (t_jdbc_seq.nextval,?,?,?,?,?,?)";
			 preparedStatement=connection.prepareStatement(sql);
			//执行sql语句
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getZip());
			preparedStatement.setString(4, user.getAddress());
			preparedStatement.setString(5, user.getTelephone());
			preparedStatement.setString(6, user.getEmail());
			preparedStatement.executeUpdate();
			//关闭资源
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally{
			ConnectionFactory.close(connection, preparedStatement, null);
		}
		
	}

	@Override
	public void deleteCustomer(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User selectCustomerByName(String name) {
		//连接数据库
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		User user=null;
				
		try {
			//获取连接对象
			 connection=ConnectionFactory.getConnection();
			//获取搬运工对象
			String sql="select id,name,password,zip,address,telephone,email from s_jdbc where name=?";
			 preparedStatement=connection.prepareStatement(sql);
			//执行SQL语句
			preparedStatement.setString(1, name);
			resultSet=preparedStatement.executeQuery();
			//处理结果集
			while(resultSet.next()){
				long id=resultSet.getLong("id");
				String name1=resultSet.getString("name");
				String password=resultSet.getString("password");
				String zip=resultSet.getString("zip");
				String address=resultSet.getString("address");
				String telephone=resultSet.getString("telehone");
				String email=resultSet.getString("email");
				user=new User(id, name1, password, zip, address, telephone, email);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			ConnectionFactory.close(connection, preparedStatement, resultSet);
		}
		
		return user;
	}

	@Override
	public List<User> selectAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
