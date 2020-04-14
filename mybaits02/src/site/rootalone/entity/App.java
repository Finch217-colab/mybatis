package site.rootalone.entity;

import org.junit.Test;
import java.io.InputStream;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import java.util.List;
import site.rootalone.dao.IBookDao;


public class App{

	@Test
	public void test() {
	// 1.加载配置文件
	InputStream in = App.class.getResourceAsStream("/mybaits-config.xml");
	//创建sessionFactory
	SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
	//得到一个session
	SqlSession session = sf.openSession();
        //查询数据库
	IBookDao bookDao = session.getMapper(IBookDao.class);
	List<Book> books = bookDao.findAll();
	for (Book book : books) {
		System.out.println(book.getName());
	}
	//关闭资源
	if (session!=null) {
		session.close();
	}
	}
}
