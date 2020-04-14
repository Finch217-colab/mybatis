package site.rootalone.entity;

import org.junit.Test;
import java.io.InputStream;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import java.util.List;


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
	List<Book> books = session.selectList("site.rootalone.entity.Book.allMap");
	for (Book book : books) {
		System.out.println(book.getPrice());
	}
	//关闭资源
	if (session!=null) {
		session.close();
	}
	}
}
