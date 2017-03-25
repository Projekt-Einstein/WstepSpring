package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dominik C.
 */
public class TaskListWrapper {

    private List<ToDoTask> taskList = new ArrayList<>();

    public TaskListWrapper() {
    }

    public TaskListWrapper(List<ToDoTask> taskList) {
        this.taskList = taskList;
    }

    public boolean add(ToDoTask task) {
        return taskList.add(task);
    }

    public List<ToDoTask> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<ToDoTask> taskList) {
        this.taskList = taskList;
    }
}
