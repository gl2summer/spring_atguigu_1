package com.hao.beans.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired//按类型自动装配
	//@Qualifier("userRepositoryImpl")//指定具体Bean名称装配
	private UserRepository userRepository;
	
//	@Autowired
//	@Qualifier("userRepositoryImpl")
//	public void setUserRepository(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}

	public void add() {
		System.out.println("UserService add...");
		userRepository.save();
	}
}
