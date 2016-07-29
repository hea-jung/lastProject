package main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import main.dto.MainDTO;
import main.service.MainService;
import member.dto.MemberDTO;
@Controller
public class MainController {
	@Autowired
	MainService service;
	@RequestMapping("/index.do")
	public ModelAndView mainlist(HttpServletRequest req){
		HttpSession ses = req.getSession(false);
		ModelAndView mav = new ModelAndView();
		String view = "index";
		String region = "";
		
		if(ses == null||ses.getAttribute("user")==null){		
			region = "¼­¿ï½Ã";			
		}else{
			MemberDTO member = (MemberDTO)ses.getAttribute("user");
			region = member.getConcernA1();			
		}
		MainDTO dto = (MainDTO)service.mainlist(region);
		mav.addObject("mainlist", dto);
		mav.setViewName(view);			
		
		return mav;
	}
}
