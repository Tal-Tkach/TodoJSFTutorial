package Todo.Dao;

import java.util.Collection;

public interface Dao<T> {
    Collection<T> getAll();
    int save(T t);
}
