package demo.dao.impl;

import demo.dao.BookDao;
import demo.model.Book;
import org.springframework.stereotype.Repository;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-19 10:37
 */
@Repository
public class BookDaoImpl extends GenericDaoImpl<Book, Long> implements BookDao {}
