package spark.dao;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Christian Adkin on 15/05/2017.
 */
public class BaseDaoMock<T extends Entity> implements BaseDao<T> {

    private List<T> entities = new ArrayList<>();
    private Long counter = 0L;

    @Override
    public void create(T entity) {
        if (!entities.contains(entity)) {
            entities.add(entity);
        }
    }

    @Override
    public void remove(T entity) {
        this.entities.remove(entity);
    }

    @Override
    public T findById(Long id) {
        for (T entity : this.entities) {
            if (entity.getId().equals(id)) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public List<T> getAll() {
        return Collections.unmodifiableList(this.entities);
    }
}
