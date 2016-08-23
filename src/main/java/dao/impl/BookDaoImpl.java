package dao.impl;

import dao.BookDao;
import model.Book;
import org.springframework.stereotype.Repository;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-19 10:37
 */
@Repository
public class BookDaoImpl extends GenericDaoImpl<Book> implements BookDao {}
