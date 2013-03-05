package springapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import springapp.domain.Login;

@Controller
public class LoginController {

	@RequestMapping(value="/doLogin.htm",method=RequestMethod.POST)
	public String validateLogin(@ModelAttribute("login") Login login,BindingResult result, SessionStatus status){
		System.out.println("Entering validateLogin");
		return "hello";
	}

	
	@RequestMapping(value="/doLogin.htm",method=RequestMethod.GET)
	public String getLoginPage(){
		System.out.println("Entering validateLogin");
		return "hello";
	}
}
