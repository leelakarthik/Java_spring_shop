package com.example.shop.controller;

import javax.servlet.http.HttpSession;

import com.example.shop.bean.Customer;
import com.example.shop.bean.Login;
import com.example.shop.repository.LoginRepo;
import com.example.shop.repository.RegisterRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

	@Autowired
	private RegisterRepo repo;

	@Autowired
	private LoginRepo lRepo;
	Model model;

	@GetMapping("/register")
	public String register() {
		// ModelAndView mav = new ModelAndView();
		model.addAttribute("customer", new Customer());
		// mav.setViewName("register");
		return "register";
	}

	@GetMapping("/welcome")
	public String welcome() {
        return "welcome";
    }
	
	@PostMapping("/saveDetails")                     
    public String saveDetails(@ModelAttribute("customer") Customer customer,HttpSession session) {
		System.out.println(customer);
		repo.save(customer);
		Login newUser = new Login(customer.getEmail(), customer.getPassword());
		System.out.println(newUser.toString());
		lRepo.save(newUser);
		model.addAttribute("check", "Registration sucessfull");
		return "redirect:/"; 
	}
	
}