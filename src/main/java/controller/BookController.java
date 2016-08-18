package controller;

import model.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-18 09:14
 */
@Controller
@RequestMapping("book")
public class BookController extends BaseController {

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping("create")
    private String create(Book book) {
        sqlSession.insert("book.create", book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("queryAll")
    private String queryAll() {
        session.setAttribute("books", sqlSession.selectList("book.queryAll"));
        return "redirect:/home.jsp";
    }

    @RequestMapping("queryById/{id}")
    private String queryById(@PathVariable int id) {
        session.setAttribute("book", sqlSession.selectOne("book.queryById", id));
        return "redirect:/edit.jsp";
    }

    @RequestMapping("modify")
    private String modify(Book book) {
        sqlSession.update("book.modify", book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("remove/{id}")
    private String remove(@PathVariable int id) {
        sqlSession.update("book.remove", id);
        return "redirect:/book/queryAll";
    }
}
