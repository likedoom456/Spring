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
public class UserController {

    @RequestMapping("create")
    private String create(User user) {
        System.out.println(user);
        try (SqlSession sqlSession = SqlSessionUtil.getSqlSession(true)){
            sqlSession.insert("user.create", user);
        }
        return "/index.jsp";
    }
}
