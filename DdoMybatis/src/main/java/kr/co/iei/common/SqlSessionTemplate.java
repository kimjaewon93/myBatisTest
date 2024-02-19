package kr.co.iei.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// Database에 접속, 연결을 만들어주는 클래스
public class SqlSessionTemplate {
	public static SqlSession getConnection() {
		SqlSession conn = null;
		String resource = "mybatis-config.xml";
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			SqlSessionFactoryBuilder tech = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = tech.build(is);
			conn = factory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
