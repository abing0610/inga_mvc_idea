package com.inga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 登录页面 判断是否进如下一个页面
 * 
 * @author abing
 *
 */
@Controller
public class LoginController {

	@RequestMapping("/login")
	public String loginIs(Model model){


//		model.add

		return "jsp/show";
	}
}
