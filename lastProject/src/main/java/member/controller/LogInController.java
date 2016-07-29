package member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import member.dto.MemberDTO;
import member.service.MemberService;

@Controller
public class LogInController {
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showLoginPage(){
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String InsertDb(HttpServletRequest req, MemberDTO member ){
				
		System.out.println(member.getId());
		System.out.println(member.getPass());
		String page="";
		MemberDTO user = service.login(member);
		if(user == null){
			//다시 로그인 페이지로
			page = "login";			
		}else{
			page="redirect:/index.do";			
		}
		
		HttpSession ses = req.getSession();
		ses.setAttribute("user", user);
		
		return page;
	}
	
	
	

}
