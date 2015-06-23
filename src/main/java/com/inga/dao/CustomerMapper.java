package com.inga.dao;

import java.util.List;

import com.inga.bean.CustomerEntity;
import com.inga.utils.MyBatisDao;

@MyBatisDao
public interface CustomerMapper {

	public List<CustomerEntity> queryCustomer();
}
