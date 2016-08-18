package controller;

import model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-17 09:44
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping("create")
    private String create(User user) {
        sqlSession.insert("user.create", user);
        return "redirect:/index.jsp";
    }

    @RequestMapping("login")
    private String login(User user) {
        user = sqlSession.selectOne("user.login", user);
        if (user != null) {
            session.setAttribute("email", user.getEmail());
            return "redirect:/book/queryAll";
        }
        request.setAttribute("message", "invalid email or password.");
        return "/index.jsp";
    }

    @RequestMapping("logout")
    private String logout() {
        session.invalidate();
        return "redirect:/index.jsp";
    }
}
