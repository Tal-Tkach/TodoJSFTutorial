package Todo.Service;

import Todo.Dao.ToDoDao;
import Todo.Dao.Todo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class BaseTodoService {

    protected ToDoDao todoDao;
    private Todo todo = new Todo();

    public void save() {
        todoDao.save(todo);
        todo = new Todo();
    }

    public Collection<Todo> getAllTodo() {
        return todoDao.getAll();
    }

    public Todo getTodo() {
        return todo;
    }


}
