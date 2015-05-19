package com.inga.controller;

import java.awt.image.RescaleOp;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.inga.bean.CustomerEntity;
import com.inga.bean.TUser;
import com.inga.service.CustomerService;
import com.inga.service.TUserService;


@Controller
public class UserController {
	
	@Resource
	private TUserService userService;
	
	@Resource
	private CustomerService  customerService;

	@RequestMapping("/helloWorld")
	public String helloWorld(@RequestParam String name,Model model){
		System.out.println("name : " + name);
//		System.out.println(" tUser.getName() ： " + tUser.getName());
		
		List<TUser> list = new ArrayList<TUser>();
		
		list = this.userService.getUserById(name);
		
		
		
		List<Map<String, String>> listmap = new ArrayList<Map<String, String>>();
		
		System.out.println(listmap.size());
		
		for (Map<String, String> map : listmap) {
			
			for(Map.Entry<String, String> m : map.entrySet()){
				System.out.println(m.getKey() + " :  " + m.getValue());
			}
			
		}
		
		//--CustomerService的测试
		
		List<CustomerEntity> customers = this.customerService.getCustomers();
		
		System.out.println(" customers.size() : " + customers.size());
		
		for(CustomerEntity cEntity : customers){
			System.out.println(cEntity.getId());
			System.out.println(cEntity.getOrder_name());
			System.out.println(cEntity.getName());
			System.out.println(cEntity.getName_or());
			
		}
		
		
//		model.addAttribute("tUser", tUser);
		model.addAttribute("user", "inga");
		model.addAttribute("msg", "11111");
		
		model.addAttribute("list", list);
		
		
		return "jsp/show";
	}
	
	/**
	 *   用的jquery的ajax，往前台传json
	 * @param name
	 * @param age
	 * @return
	 */
	@RequestMapping("/index/jsonTest")
	@ResponseBody
	public String jsonTest(@RequestParam String name,@RequestParam String age){
		
		System.out.println("1111111");
		
		System.out.println(" name : " + name);
		System.out.println(" age : " + age);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("beijing", "beijing");
		map.put("shanghai", "shanghai");
		map.put("suzhou", "suzhou");
		map.put("weifang", "weifang");
		
		return JSON.toJSONString(map);
	}
	
}
