package service.impl;

import dao.GenericDao;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BookService;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-22 16:10
 */
@Service
public class BookServiceImpl extends GenericServiceImpl<Book, Long> implements BookService {

    @Autowired
    public BookServiceImpl(GenericDao<Book, Long> genericDao) {
        super(genericDao);
    }
}
