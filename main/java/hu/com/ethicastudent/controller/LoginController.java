package hu.com.ethicastudent.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/* Ez az osztály most semmit nem fog csinálni azon kívűl, hogy megnézi, hogy a 
username és a jelszó "ethica"-e
Valójában itt kellene összepakolni a normális autentikációt és authorizációt.
*/ 

@Controller
public class LoginController {
	

	@RequestMapping("/")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	  public String loginSubmit(@ModelAttribute String ex, String username , String password) {

		if( username.equals( "ethica") && password.equals( "ethica" )) {

			return "redirect:/students";
		}else {
			return "login";
		}
	  }

}
