package com.example.shop.controller;

import java.util.Objects;

import com.example.shop.bean.Login;
import com.example.shop.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class LoginController {
	
	@Autowired
    private LoginService userService;
                         
    @GetMapping("/")      
    public String login(Model model) {
    	// ModelAndView mav = new ModelAndView("index");
        model.addAttribute("user", new Login());
        model.addAttribute("check", "");
        return "index";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") Login user) {

        Login oauthUser = userService.login(user.getUsername(), user.getPassword());

        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {

            return "redirect:/welcome";

        } else {
            return "redirect:/";
        }
    }

    
    // @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    // public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    // {
    //     return "redirect:/index";
    // }

}