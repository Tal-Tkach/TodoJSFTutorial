package Todo.Service;

import Todo.Dao.ToDoDao;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;


@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode= ScopedProxyMode.TARGET_CLASS)
@Component(value = "todoService")
@RequestMapping(value = "*")
public class TodoService extends BaseTodoService {

    private int messageChanges = 0;

    public TodoService() {
        super();
        this.todoDao = new ToDoDao();
    }

    public void increaseMessageChanges() {
        this.messageChanges++;
    }

    public int getMessageChanges(){
        return this.messageChanges;
    }
}
