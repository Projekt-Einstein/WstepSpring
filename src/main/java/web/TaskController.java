package web;

import model.ToDoTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.repo.ToDoTaskRepositoryImpl;

/**
 * @author Dominik C.
 */
@Controller
public class TaskController {

    @Autowired
    private ToDoTaskRepositoryImpl taskRepository;

    @GetMapping("new")
    public String addNew(Model model) {

        model.addAttribute("task", new ToDoTask());

        return "addNew";
    }

    @PostMapping(value = "/new")
    public String newTask(@ModelAttribute ToDoTask task) {
        taskRepository.addNewTask(task);

        return "redirect:/all";
    }

    @GetMapping("/all")
    public String listAllTasks(Model model) {
        model.addAttribute("taskList", taskRepository.getAllTasks());

        return "taskList";
    }

}
