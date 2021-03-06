package com.mc.ryan.service.common;

import java.util.List;

import com.mc.ryan.vo.common.UserVO;

public interface IUserService {
	
	/**
	 * 查询全量user数据
	 * @return
	 */
	List<UserVO> findAllUser();
	
	/**
	 * 插入user数据
	 * @param list
	 * @return
	 */
	int insertUserList(List<UserVO> list);
	
	/**
	 * 查询最大的userNO
	 * @return
	 */
	int finaUserMaxID();

}
