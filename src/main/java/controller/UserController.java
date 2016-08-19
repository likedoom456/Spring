package controller;

import dao.UserDao;
import model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Autowired
    private UserDao userDao;

    @RequestMapping("create")
    private String create(User user) {
//        sqlSession.insert("user.create", user);
        userDao.create(user);
        return "redirect:/index.jsp";
    }

    @RequestMapping("login")
    private String login(User user) {
        user = userDao.login(user);
        if (user != null) {
            session.setAttribute("user", user);
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
