package com.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.domain.UserVo;
import com.mybatis.domain.Users;
import com.mybatis.util.SessionFactortUtil;

/** 
 * @author WYQ
 * @date 创建时间：2016年7月28日 下午2:01:28 
*/
public class Test {
	public static void main(String[] args) {
		 SqlSessionFactory ssf = SessionFactortUtil.getSessionFactory();
		 SqlSession session = ssf.openSession();
		 String statment="com.mybatis.domain.usersMapper.selectbtween";
		 UserVo user = new UserVo();
		 user.setAgemin(15);
		 user.setAgemax(20);
		 List<Users> list = session.selectList(statment,user);
		 System.out.println(list.size());
	}
}
