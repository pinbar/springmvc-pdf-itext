package com.percipient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.percipient.bean.Student;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private Student student;

	@RequestMapping(value = "/html", produces = "application/xml")
	public String html(Model model) {
		student.setName("Corey Brown");
		model.addAttribute("stud", student);
		return "studentPage";
	}
	
	@RequestMapping("/beanToPdfSimple")
	public ModelAndView beanToPdfSimple() {
		ModelAndView m = new ModelAndView("simpleStudPdfView");
		student.setName("Braxton Miller");
		m.getModelMap().addAttribute("stud", student);
		return m;
	}

	@RequestMapping("/beanToPdfRich")
	public ModelAndView beanToPdf() {
		ModelAndView m = new ModelAndView("richStudPdfView");
		student.setName("Braxton Miller");
		m.getModelMap().addAttribute("stud", student);
		return m;
	}

}
