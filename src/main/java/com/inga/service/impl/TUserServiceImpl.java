package com.inga.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.inga.bean.TUser;
import com.inga.dao.CustomerMapper;
import com.inga.dao.TUserMapper;
import com.inga.service.TUserService;

@Service("userService")
public class TUserServiceImpl implements TUserService {

//	@Resource
//	private TUserDao userDao;
	
	@Autowired
	private TUserMapper tUserMapper;
	
	@Resource
	private CustomerMapper customerMapper;

	@CacheEvict(value = "userCache",allEntries = true)
	public  void  reload(){

	}


	/**
	 * 测试通过内部调用，是否会经过aop来调用cache
	 * @param id
	 * @return
	 */
	public  List<TUser> getUserByid2(String id){

		return  this.getUserById(id);
	}

	/**
	 * 获取tuser信息，使用了Cacheable信息,用的是spring的缓存
	 * @param id
	 * @return
	 */
	@Cacheable(value = "userCache")
	public List<TUser> getUserById(String id) {
		// TODO Auto-generated method stub


		System.out.println("########################");
		System.out.println("query db ........................");
		System.out.println("########################");


		List<TUser> list = new ArrayList<TUser>();
		list = this.tUserMapper.getUserById();
		System.out.println(" lise : size  : " + list.size());
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
