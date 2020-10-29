package co.soft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.soft.beans.ToiletBean;
import co.soft.service.ToiletService;

@Controller
public class Cont {
	@Autowired
	private ToiletService t_service;
	
	
	@GetMapping("/main")
	public String main(Model model) {
		List<ToiletBean> li = t_service.getToiletBeans();
		model.addAttribute("li",li);
		return "main";
	}

}
