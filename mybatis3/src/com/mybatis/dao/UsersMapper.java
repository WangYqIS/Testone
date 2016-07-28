package com.mybatis.dao;

import java.util.List;

import com.mybatis.domain.UserVo;
import com.mybatis.domain.Users;

/** 
 * @author WYQ
 * @date ����ʱ�䣺2016��7��27�� ����8:54:20 
*/
public interface UsersMapper {

	public Users getUsersbyid(int id);
	public List<Users> selectbtween(UserVo uservo);
	public List<Users> fuzzyQuery(UserVo uservo);
}
