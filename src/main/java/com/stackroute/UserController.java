package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class UserController {
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        User user = new User("user1");
        model.addAttribute("user", user);
        return "index";
    }
}
