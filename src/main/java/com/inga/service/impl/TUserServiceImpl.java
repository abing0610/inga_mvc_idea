package com.inga.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inga.bean.TUser;
import com.inga.dao.CustomerMapper;
import com.inga.dao.TUserMapper;
import com.inga.service.TUserService;

@Service("userService")
public class TUserServiceImpl implements TUserService {

//	@Resource
//	private TUserDao userDao;
	
	@Resource
	private TUserMapper tUserMapper;
	
	@Resource
	private CustomerMapper customerMapper;

	public List<TUser> getUserById(String id) {
		// TODO Auto-generated method stub
		
		List<TUser> list = new ArrayList<TUser>();
		list = this.tUserMapper.getUserById();
		return list;
	}

	public List<Map<String, String>> queryAddress() {
		// TODO Auto-generated method stub
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		list = this.tUserMapper.queryAddress();
		
		return list;
	}
	

//	public List<TUser> getUserById(String id) {
//		// TODO Auto-generated method stub
//		List<TUser> list = new ArrayList<TUser>();
//		list = this.userDao.getAllTUser();
//		return list;
//	}
	

}
