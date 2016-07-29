package member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import member.service.MemberService;

@Controller
public class LogOutController {
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpServletRequest req){
		HttpSession ses = req.getSession(false);
		if(ses != null){
			ses.invalidate();
		}
		return "redirect:/index.do";
	}

}
