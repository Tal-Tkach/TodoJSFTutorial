package Todo.Dao;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class ToDoDao implements Dao<Todo> {

    private List<Todo> todoList = new ArrayList<>();

    @Override
    public Collection<Todo> getAll() {
        return todoList.stream()
                .filter(Objects::nonNull).sorted(Comparator.comparingInt(Todo::getPriority))
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }

    @Override
    public int save(Todo todo) {
        todoList.add(todo);
        int index = todoList.size() - 1;
        todo.setId(index);
        return index;
    }
}
