package ways_to_work_with_bd.by.yurachel.dao;

import ways_to_work_with_bd.by.yurachel.model.Phone;

import java.util.List;

public interface IDao <T>{
    List<T> findAll();

    T findById(long id);

    boolean removeById(long id);

    boolean updateById(long id, T object);

    boolean create(T object);

    Phone findByName(String objectName);
}
