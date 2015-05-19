package com.inga.service;

import java.util.List;
import java.util.Map;

import com.inga.bean.TUser;

public interface TUserService {

	public List<TUser> getUserById(String id);
	
	public List<Map<String, String>> queryAddress();
	
}
