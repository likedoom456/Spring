package service;

import model.Book;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-22 16:08
 */
public interface BookService {

    void create(Book book);

    void remove(int id);

    void modify(Book book);

    Book queryById(int id);

    List<Book> queryAll();
}
