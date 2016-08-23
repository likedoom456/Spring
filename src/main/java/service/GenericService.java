package service;

import java.util.List;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-23 13:25
 */
public interface GenericService<T, ID> {
    void create(T model);

    void remove(ID id);

    void modify(T model);

    T queryById(ID id);

    List<T> list();

    T query(String statement, Object parameter);

    List<T> queryList(String statement, Object parameter);
}
