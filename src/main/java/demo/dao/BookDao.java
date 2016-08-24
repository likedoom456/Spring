package demo.dao;


import demo.model.Book;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-19 10:34
 */
// DAO: 通用的数据库操作
public interface BookDao extends GenericDao<Book, Long> {}
