package dao.impl;

import dao.UserDao;
import model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-19 09:43
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void create(User user) {
        sqlSession.insert("user.create", user);
    }

    @Override
    public User queryUserByEmail(String email) {
        return sqlSession.selectOne("user.queryUserByEmail", email);
    }
}
