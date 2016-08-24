package demo.dao.impl;

import demo.dao.UserDao;
import demo.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-19 09:43
 */
@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {
}
