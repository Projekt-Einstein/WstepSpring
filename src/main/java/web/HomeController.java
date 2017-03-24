package web;

import model.ToDoTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.repo.ToDoTaskRepositoryImpl;

import java.util.List;

/**
 * @author Dominik C.
 */
@Controller
public class HomeController {

    @Autowired
    private ToDoTaskRepositoryImpl taskRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {

        model.addAttribute("taskList", taskRepository.getAllTasks());

        return "home";
    }

}

