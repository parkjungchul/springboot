package com.example.demo.service;

import java.util.List;

import com.example.demo.data.entity.User;

public interface UserService {
	
	/**
	 * ����� ��� ��ȸ
	 * @return
	 */
	public List<User> selectUserList();
	
	
	/**
	 * ����� ��ȸ
	 * @param uid
	 * @return
	 */
	public User selectUser(Long uid);
	
	/**
	 * ����� ���
	 * @param user
	 */
	public void insertUser(User user);
	
	/**
	 * ����� ���� ����
	 * @param user
	 */
	public void updateUser(User user);
	
	/**
	 * ����� ����
	 * @param uid
	 */
	public void deleteUser(Long uid);
	
	
	

}
