package com.mc.ryan.dao.common;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mc.ryan.vo.common.UserVO;

@Mapper
public interface IUserDao {
	
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
