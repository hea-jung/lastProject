package member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import member.dto.MemberDTO;
import member.service.MemberService;

@Controller
public class SignUpController {
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String showSignupPage(){
		return "signup";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String InsertDb(HttpServletRequest req, MemberDTO member ){
		System.out.println("여기는 signup컨트롤러_____________________");
		System.out.println(member.toString());
				
		String con = member.getConcernA1();
		if(con.contains(",")){
			member.setConcernA1(con.split(",")[0]);
			member.setConcernA2(con.split(",")[1]);					
		}else{			
			member.setConcernA2(" ");
		}
		
		
		String con2 = member.getConcernB1();
		if(con2.contains(",")){
			member.setConcernB1(con.split(",")[0]);
			member.setConcernB2(con.split(",")[1]);					
		}else{			
			member.setConcernB2(" ");
		}
				
		service.signup(member);
		
		return "redirect:/index.do";
	}
	
	
	

}
