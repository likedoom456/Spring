package demo.service;

import demo.model.User;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-22 15:46
 */
public interface UserService extends GenericService<User, Integer> {

    boolean register(User user);

    User login(User user);
}
