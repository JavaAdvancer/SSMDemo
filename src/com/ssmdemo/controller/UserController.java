package com.ssmdemo.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssmdemo.entity.User;
import com.ssmdemo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource(name="userServiceImpl")
	private UserService userService;
	
	@RequestMapping("/findAllUser")
	ModelAndView findAllUser(Map<String, Object> map){
		List<User> listUser = userService.findAllUser();
		for(User u:listUser){
			System.out.println(u);
		}
		ModelAndView modelAndView = new ModelAndView("userList");
		modelAndView.addObject("listUser", listUser);
		return modelAndView;
	}
	
	@RequestMapping(value="/insertUser",method=RequestMethod.POST)
	ModelAndView insertUser(User user){
		user.setId((int)System.currentTimeMillis());
		Integer flag = userService.insertUser(user);
		ModelAndView modelAndView = new ModelAndView();
		if(flag!=null){
			modelAndView.setViewName("success");
		}else{
			modelAndView.setViewName("error");
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/showUserDetails",method=RequestMethod.GET)
	ModelAndView findByUserId(@RequestParam("id") Integer id){
		User user = userService.findByUserId(id);
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userDetails");
		modelAndView.addObject("user",user);
		return modelAndView;
	}
	@RequestMapping(value="/deleteUserById",method=RequestMethod.GET)
	ModelAndView deleteUserById(@RequestParam("id") Integer id){
		Integer flag = userService.deleteUserById(id);
		ModelAndView modelAndView = new ModelAndView();
		if(flag!=null){
			modelAndView.setViewName("success");
		}else{
			
			modelAndView.setViewName("error");
		}
		return modelAndView;
	}
	@RequestMapping(value="/testRequestBody",method=RequestMethod.GET)
	ModelAndView testRequestBody(@RequestBody String requestBody){
		System.out.println(requestBody);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("testRequestBody");
		return modelAndView;
	}
}
