package dao.impl;

import com.mysql.jdbc.Driver;
import dao.UserDao;
import model.User;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-19 09:54
 */
@Repository
public class UserDaoJDBCImpl implements UserDao {

    @Override
    public void create(User user) {
        System.out.println("JDBC...");
        try {
            new Driver();
            Connection connection = DriverManager.getConnection("jdbc:mysql:///db_test?user=root&password=system");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO db_test.user VALUES(NULL, ?, ?)");
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());

            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
