package com.inga.dao;

import java.util.List;

import com.inga.bean.CustomerEntity;

public interface CustomerMapper {

	public List<CustomerEntity> queryCustomer();
}
