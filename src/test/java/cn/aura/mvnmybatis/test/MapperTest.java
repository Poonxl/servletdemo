package cn.aura.mvnmybatis.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.aura.mvnmybatis.entity.Book;
import cn.aura.mvnmybatis.mapper.BookMapper;

public class MapperTest {

	@Test
	public void test() throws IOException {
		Reader reader = Resources.getResourceAsReader("mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = ssf.openSession(true);
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = mapper.findById(1);
		System.out.println(book);
		session.close();
	}
}
