package com.mybatis.Impl;

import java.util.List;

import com.mybatis.bean.User;

public interface IUser {
	public User selectUserById(Integer id);
	//��ѯ�����
	public List<User> selectUsers(String userName);
	//mybatis��������
	public void addUser(User user);
	//mybatis�޸�
	public void updateUser(User user);
	//mybayisɾ��
	public void deleteUser(Integer id);
}
