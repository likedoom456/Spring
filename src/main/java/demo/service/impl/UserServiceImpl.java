package demo.service.impl;

import demo.dao.GenericDao;
import demo.model.User;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demo.service.UserService;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-22 15:48
 */
@Service // @Component @Controller @Repository
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {

    @Autowired
    public UserServiceImpl(GenericDao<User, Integer> genericDao) {
        super(genericDao);
    }

    @Override
    public boolean register(User user) {
        if (genericDao.query("user.queryUserByEmail", user.getEmail()) != null) {
            return false;
        }
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        user.setPassword(encryptor.encryptPassword(user.getPassword()));
        genericDao.create(user);
        return true;
    }

    @Override
    public User login(User user) {
        String plainPassword = user.getPassword();
        user = genericDao.query("user.queryUserByEmail", user.getEmail());
        if (user != null) {
            StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
            if (encryptor.checkPassword(plainPassword, user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
