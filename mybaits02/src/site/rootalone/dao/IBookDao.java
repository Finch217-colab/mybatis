package site.rootalone.dao;

import org.apache.ibatis.annotations.Select;

import site.rootalone.entity.Book;
import java.util.List;

public interface IBookDao {
	@Select( "select book_id as id, book_name as name, book_price as price, book_page as page  from book" )
	List<Book> findAll();
}
