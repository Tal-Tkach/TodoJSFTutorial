package Todo.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "*", method = RequestMethod.GET)
@Component(value = "TodoController")
public class TodoController {

    public String loadTodoPage() {
        return "todo.xhtml";
    }

}
