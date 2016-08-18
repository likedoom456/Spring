package controller;

import model.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import util.SqlSessionUtil;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-18 09:14
 */
@Controller
@RequestMapping("book")
public class BookController extends BaseController {

    @RequestMapping("create")
    private String create(Book book) {
        try (SqlSession sqlSession = SqlSessionUtil.getSqlSession(true)){
            sqlSession.insert("book.create", book);
        }
        return "redirect:/book/queryAll";
    }

    @RequestMapping("queryAll")
    private String queryAll() {
        try (SqlSession sqlSession = SqlSessionUtil.getSqlSession(false)){
            session.setAttribute("books", sqlSession.selectList("book.queryAll"));
        }
        return "redirect:/home.jsp";
    }
}
