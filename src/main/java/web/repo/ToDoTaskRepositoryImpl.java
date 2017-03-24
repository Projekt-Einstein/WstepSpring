package web.repo;

import model.ToDoTask;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dominik C.
 */
@Repository
public class ToDoTaskRepositoryImpl {

    private List<ToDoTask> taskList = new ArrayList<>();

    {
        for (int i = 0; i < 10; i++) {
            taskList.add(new ToDoTask("Task " + i));
        }
    }

    public List<ToDoTask> getAllTasks() {
        return taskList;
    }

    public void addNewTask(ToDoTask task) {
        taskList.add(task);
    }

}
