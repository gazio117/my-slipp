package net.slipp.myslipp.web;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * UserController
 */
@Controller
public class UserController {
    
    private List<User> users = new ArrayList<User>();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/create")
    public String create(User user) {
        System.out.println("user : " + user);
        users.add(user);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("users", users);
        return "list";
    }
}