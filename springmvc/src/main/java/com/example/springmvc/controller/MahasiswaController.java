package com.example.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springmvc.repository.MahasiswaRepository;

@Controller
public class MahasiswaController {
	@Autowired
	private MahasiswaRepository mahasiswaRepository;
	
	@GetMapping("/index")
	public ModelMap getAll(@PageableDefault(3) Pageable pageable) {
		return new ModelMap().addAttribute("mahasiswas", mahasiswaRepository.findAll(pageable));
	}
	
	@GetMapping("/")
	public String index() {
		return "redirect:/index";
	}
}
