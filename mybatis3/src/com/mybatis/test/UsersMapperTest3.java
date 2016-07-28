package com.mybatis.test;

import static org.junit.Assert.*;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.dao.UsersMapper;
import com.mybatis.domain.UserVo;

/** 
 * @author WYQ
 * @date 创建时间：2016年7月28日 下午2:58:53 
*/
public class UsersMapperTest3 {
	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		String resource = "config.xml";
		Reader reder = Resources.getResourceAsReader(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reder);
	}
	@Test
	public void test() {
		SqlSession session = sqlSessionFactory.openSession();
		UsersMapper usersMapper = session.getMapper(UsersMapper.class);
		UserVo uservo = new UserVo();
		List age = new ArrayList();
		age.add(15);
		age.add(17);
		uservo.setList(age);
		List users = usersMapper.selectbtween(uservo);
		System.out.println(users);
	}

}
