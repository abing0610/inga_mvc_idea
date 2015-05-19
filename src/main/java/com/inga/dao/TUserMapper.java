package com.inga.dao;

import java.util.List;
import java.util.Map;

import com.inga.bean.TUser;

public interface TUserMapper {

	public List<TUser> getUserById();
	
	public List<Map<String, String>> queryAddress();
}
