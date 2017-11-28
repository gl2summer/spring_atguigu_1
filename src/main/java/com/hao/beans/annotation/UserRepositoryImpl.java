package com.hao.beans.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@Autowired(required=false)
	private UserComponent userComponent;
	
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserRpository save...");
		System.out.println(userComponent);
	}

}
