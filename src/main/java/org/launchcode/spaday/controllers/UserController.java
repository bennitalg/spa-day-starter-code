package org.launchcode.spaday.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class UserController {

    public String displayAdUserForm(){

        return "user/add";
    }

    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        while (user.password)
    }
}
