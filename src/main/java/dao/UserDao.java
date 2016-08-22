package dao;

import model.User;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-19 09:41
 */
public interface UserDao {
    void create(User user);

    User queryUserByEmail(String email);
}
