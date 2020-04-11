package Todo.Service;

import Todo.Dao.ToDoDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;


@Scope(value = WebApplicationContext.SCOPE_APPLICATION)
@RequestMapping(value = "/app")
@Component(value = "todoGlobalService")
public class TodoGlobalService extends BaseTodoService {

    public TodoGlobalService() {
        super();
        this.todoDao = new ToDoDao();
    }
}
