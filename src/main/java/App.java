import model.Todo;
import service.TodoService;
import service.TodoServiceImpl;
import utils.TodoUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TodoUtils todoUtils = new TodoUtils();
        ArrayList<Todo> todos = todoUtils.getTodos();
        TodoServiceImpl todoServiceImpl = new TodoServiceImpl(todos, scanner);

        todoServiceImpl.printMainMenu();
    }
}