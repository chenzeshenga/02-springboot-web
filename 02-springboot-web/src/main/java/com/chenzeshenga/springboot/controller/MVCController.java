package com.chenzeshenga.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chenzeshenga.springboot.model.User;

@RestController // @@RestController=@Controller+@ResponseBody
public class MVCController {

	@RequestMapping(value = "/boot/getUser", method = RequestMethod.GET)
	public Object getUser() {
		User user = new User();
		user.setId("123");
		user.setName("abc");
		return user;
	}

	/**
	 * @GetMapping 只支持get请求
	 * @return
	 */
	@GetMapping("/boot/getUser1")
	public Object getUser1() {
		User user = new User();
		user.setId("123");
		user.setName("abc");
		return user;
	}

	/**
	 * @PostMapping 只支持post请求
	 * @return
	 */
	@PostMapping("/boot/getUser2")
	public Object getUser2() {
		User user = new User();
		user.setId("123");
		user.setName("abc");
		return user;
	}

}
