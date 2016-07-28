package com.mybatis.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/** 
 * @author WYQ
 * @date 创建时间：2016年7月26日 下午2:50:22 
*/
public class SessionFactortUtil {
	
	public static SqlSessionFactory getSessionFactory(){
		String resource = "config.xml";
		SqlSessionFactory ssf= null;
		
		try {
			Reader reder = Resources.getResourceAsReader(resource);
			ssf = new SqlSessionFactoryBuilder().build(reder);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ssf;
	}
}
