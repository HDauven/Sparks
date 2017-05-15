package spark.dao;

import com.christian.spark.model.Entity;

import java.util.List;

/**
 * Created by Christian Adkin on 28/03/2017.
 */
public interface BaseDao<T extends Entity> {

    void create(T entity);

    void remove(T entity);

    T findById(Long id);

    List<T> getAll();
}
