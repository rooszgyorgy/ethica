package hu.com.ethicastudent.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import hu.com.ethicastudent.entity.Student;
import hu.com.ethicastudent.service.StudentService;

@Controller
public class MainController {

	private StudentService studentService;
	

	@Autowired
	public void setStudentService( StudentService studentService) {
		this.studentService = studentService;
	}
	
	
    @GetMapping("/students")
    public String findStudents(Model model) {

      List<Student> students = (List<Student>) studentService.findAll();

        model.addAttribute("students", students);
        
       return "menu";
    }
    
    @GetMapping("/newstudent")
    public String newStudents(Model model) {
    	
   	return "newStudent";
    }
    
	
	@PostMapping("/savestudent")
	  public String savestudent(@ModelAttribute String ex, String firstname, String lastname, String age) {
		
		/*
		 * Le kellene ellenőrizni itt is, hogy a mentendő adatok helyesek-e, pl. az age-ben nincs-e betű, mert akkor valami data type errorral elszállhat a program.
		 * De most nem ellenőrzök.
		 */
		
		double dage = Double.parseDouble( age );
		
		studentService.saveStudent( firstname, lastname , dage );
		
		return "redirect:/students";
		
	  }

    
}
