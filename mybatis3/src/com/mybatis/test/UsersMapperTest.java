package com.mybatis.test;


import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.dao.UsersMapper;
import com.mybatis.domain.Users;

/** 
 * @author WYQ
 * @date 创建时间：2016年7月27日 下午9:02:21 
*/
public class UsersMapperTest {

	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		String resource = "config.xml";
		Reader reder = Resources.getResourceAsReader(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reder);
	}

	@Test
	public void testGetUsersbyid() {
		SqlSession session = sqlSessionFactory.openSession();
		UsersMapper usersMapper = session.getMapper(UsersMapper.class);
		Users users = usersMapper.getUsersbyid(5);
		System.out.println(users);
	}

}
