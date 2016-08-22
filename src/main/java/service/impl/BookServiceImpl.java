package service.impl;

import dao.BookDao;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BookService;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-22 16:10
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void create(Book book) {
        bookDao.create(book);
    }

    @Override
    public void remove(int id) {
        bookDao.remove(id);
    }

    @Override
    public void modify(Book book) {
        bookDao.modify(book);
    }

    @Override
    public Book queryById(int id) {
        return bookDao.queryById(id);
    }

    @Override
    public List<Book> queryAll() {
        return bookDao.queryAll();
    }
}
