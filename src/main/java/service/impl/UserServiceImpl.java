package service.impl;

import dao.UserDao;
import model.User;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-22 15:48
 */
@Service // @Component @Controller @Repository
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean register(User user) {
        if (userDao.query("user.queryUserByEmail", user.getEmail()) != null) {
            return false;
        }
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        user.setPassword(encryptor.encryptPassword(user.getPassword()));
        userDao.create(user);
        return true;
    }

    @Override
    public User login(User user) {
        String plainPassword = user.getPassword();
        user = userDao.query("user.queryUserByEmail", user.getEmail());
        if (user != null) {
            StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
            if (encryptor.checkPassword(plainPassword, user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
