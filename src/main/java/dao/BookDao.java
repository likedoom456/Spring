package dao;


import model.Book;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-19 10:34
 */
// DAO: 通用的数据库操作
public interface BookDao {

    void create(Book book);

    void remove(int id);

    void modify(Book book);

    Book queryById(int id);

    List<Book> queryAll();
}
