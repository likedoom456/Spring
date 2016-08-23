package dao;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-23 09:29
 */
public interface GenericDao<T> {
    void create(T model);

    void remove(int id);

    void modify(T model);

    T queryById(int id);

    List<T> list();

    T query(String statement, Object parameter);
}
