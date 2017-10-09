package com.mybatis.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.Impl.IUser;
import com.mybatis.bean.User;

public class Test {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;
	static{
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSession(){
			return sqlSessionFactory;
	}
	
/*	public static void main(String[] args){
		SqlSession session = sqlSessionFactory.openSession();
		try{
		User user = session.selectOne("com.mybatis.bean.UserMapper.selectUserById",1);
		System.out.println(user.getUserAddress());
		System.out.println(user.getUserName());
		}finally{
			session.close();
		}
	}*/
	/*public static void main(String[] args) {
		SqlSession session = sqlSessionFactory.openSession();
		try{
			IUser Iuser =  session.getMapper(IUser.class);
			User user = Iuser.selectUserById(1);
			System.out.println(user.getUserAddress());
			System.out.println(user.getUserName());
		}finally{
			session.close();
		}
		
	}*/

	
	/*public void getUserList(String userName){
		SqlSession session = sqlSessionFactory.openSession();
		try{
		IUser Iuser = session.getMapper(IUser.class);
		List<User> users = Iuser.selectUsers(userName);
		for (User user : users) {
			System.out.println(user.getId()+":"+user.getUserName()+":"+user.getUserAddress());		
		}
		}finally{
			session.close();
		}
	}*/
	/*public static void main(String[] args) {
		Test testUser = new Test();
		testUser.getUserList("%");
	}*/
/*	public void addUser(){
		User user = new User();
		user.setUserAddress("����㳡");
		user.setUserName("����");
		user.setUserAge("22");
		SqlSession session = sqlSessionFactory.openSession();
		try{
		
		IUser Iuser = session.getMapper(IUser.class);
		Iuser.addUser(user);
		session.commit();
		System.out.println("��ǰ���ӵ��û�idΪ��"+user.getId());
		}finally{
			session.close();
		}
	}
	public static void main(String[] args) {
		Test userTest = new Test();
		userTest.addUser();
	}*/
	/*public void updateUser(){
		//�ȵõ��û�
		SqlSession session = sqlSessionFactory.openSession();
		try{
		IUser Iuser = session.getMapper(IUser.class);
		User user = Iuser.selectUserById(1);
		user.setUserAddress("ԭ����ħ�����ֶ�����԰��");
		Iuser.updateUser(user);
		session.commit();
		System.out.println("�޸ĳɹ�");
		}finally{
			session.close();
		}
	}
	public static void main(String[] args) {
		Test userTest = new Test();
		userTest.updateUser();
	}*/
	public void deleteUser(Integer id){
		SqlSession session = sqlSessionFactory.openSession();
		try{
		IUser Iuser = session.getMapper(IUser.class);
		Iuser.deleteUser(id);
		session.commit();
		System.out.println("ɾ���ɹ�");
		}finally{
			session.close();
		}
	}
	public static void main(String[] args) {
		Test userTest = new Test();
		userTest.deleteUser(10);
	}
}
