package model;

/**
 * @author Dominik C.
 */
public class ToDoTask {

    private String description;
    private boolean isFinished;

    public ToDoTask() {
    }

    public ToDoTask(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    @Override
    public String toString() {
        return description;
    }
}
