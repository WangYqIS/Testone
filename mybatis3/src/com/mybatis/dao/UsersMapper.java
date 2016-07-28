package com.mybatis.dao;

import java.util.List;

import com.mybatis.domain.UserVo;
import com.mybatis.domain.Users;

/** 
 * @author WYQ
 * @date 创建时间：2016年7月27日 下午8:54:20 
*/
public interface UsersMapper {

	public Users getUsersbyid(int id);
	public List<Users> selectbtween(UserVo uservo);
	public List<Users> fuzzyQuery(UserVo uservo);
}
