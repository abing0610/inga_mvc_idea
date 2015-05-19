package com.inga.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inga.bean.CustomerEntity;
import com.inga.dao.CustomerMapper;
import com.inga.dao.TUserMapper;
import com.inga.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Resource
	private TUserMapper tUserMapper;
	
	@Resource
	private CustomerMapper customerMapper;


	public List<CustomerEntity> getCustomers() {
		// TODO Auto-generated method stub
		
		List<CustomerEntity> list = new ArrayList<CustomerEntity>();
		
		list = this.customerMapper.queryCustomer();
		
		return list;
	}
	
}
