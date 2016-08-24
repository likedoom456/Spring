package demo.controller;

import demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import demo.service.BookService;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-18 09:14
 */
@Controller
@RequestMapping("book")
public class BookController extends BaseController {

    @Autowired
    private BookService bookService;

    @RequestMapping("create")
    private String create(Book book) {
        bookService.create(book);
        return "redirect:/book/list";
    }

    @RequestMapping("list")
    private String list() {
        session.setAttribute("books", bookService.list());
        return "redirect:/home.jsp";
    }

    @RequestMapping("queryById/{id}")
    private String queryById(@PathVariable long id) {
        session.setAttribute("book", bookService.queryById(id));
        return "redirect:/edit.jsp";
    }

    @RequestMapping("modify")
    private String modify(Book book) {
        bookService.modify(book);
        return "redirect:/book/list";
    }

    @RequestMapping("remove/{id}")
    private String remove(@PathVariable long id) {
        bookService.remove(id);
        return "redirect:/book/list";
    }
}
