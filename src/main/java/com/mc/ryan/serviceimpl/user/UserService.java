package com.mc.ryan.serviceimpl.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.mc.ryan.dao.user.IUserDao;
import com.mc.ryan.service.user.IUserService;
import com.mc.ryan.vo.user.UserVO;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private IUserDao userDao;
	
	/**
	 * 查询全量user数据
	 */
	@Override
	public List<UserVO> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}

	/**
	 * 增量user数据
	 */
	@Override
	public int insertUserList(List<UserVO> list) {
		int index = userDao.insertUserList(list);
		return index;
	}

	/**
	 * 查询最大的NO
	 */
	@Override
	public int finaUserMaxID() {
		// TODO Auto-generated method stub
		return userDao.finaUserMaxID();
	}

}
