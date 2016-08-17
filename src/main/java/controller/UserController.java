package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-17 09:44
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("create")
    private String create() {
        // TODO: 2016-08-17
        System.out.println("created...");
        return "/index.jsp";
    }
}
