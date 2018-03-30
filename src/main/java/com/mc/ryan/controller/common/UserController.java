package com.mc.ryan.controller.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mc.ryan.service.common.IUserService;
import com.mc.ryan.vo.common.UserVO;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	/**
	 * 测试方法
	 * @return
	 */
	@GetMapping("/init")
	public String init(){
		return "开始了";
	}
	
	/**
	 * 查询全量用户
	 * @return
	 */
	@GetMapping("/flidAllUser")
	public List<UserVO> flidAllUser(){
		return userService.findAllUser();
	}

	/**
	 * 新增用户
	 * @return
	 */
	@GetMapping("/insertUserList")
	public int insertUserList(){
		List<UserVO> list = new ArrayList<UserVO>();
		int max = userService.finaUserMaxID();
		for (int i = 0; i < 10; i++) {
			UserVO vo = new UserVO();
			int no = max + i;
			vo.setUserNo(String.valueOf(no));
			vo.setUserName("mcryan"+i);
			vo.setUsetPass("mcryan"+i);
			vo.setPhone("15999845712"+i);
			vo.setAddress("15999845712"+i);
			vo.setEmail("15999845712@163"+i);
			vo.setState("1");
			vo.setLoginState("0");
			list.add(vo);
		}
		int index = userService.insertUserList(list);
		return index;
	}
}
