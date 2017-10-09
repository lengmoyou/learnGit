package com.mybatis.Impl;

import java.util.List;

import com.mybatis.bean.User;

public interface IUser {
	public User selectUserById(Integer id);
	//查询结果集
	public List<User> selectUsers(String userName);
	//mybatis增加数据
	public void addUser(User user);
	//mybatis修改
	public void updateUser(User user);
	//mybayis删除
	public void deleteUser(Integer id);
}
