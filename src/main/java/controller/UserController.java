package controller;

import model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import util.SqlSessionUtil;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-17 09:44
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    @RequestMapping("create")
    private String create(User user) {
        System.out.println(user);
        try (SqlSession sqlSession = SqlSessionUtil.getSqlSession(true)) {
            sqlSession.insert("user.create", user);
        }
        return "redirect:/index.jsp";
    }

    @RequestMapping("login")
    private String login(User user) {
        try (SqlSession sqlSession = SqlSessionUtil.getSqlSession(false)) {
            user = sqlSession.selectOne("user.login", user);
        }
        if (user != null) {
            session.setAttribute("email", user.getEmail());
            return "redirect:/home.jsp";
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
