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
public class MyPageController {
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/mypage", method=RequestMethod.GET)
	public String InsertDb(HttpServletRequest req, String state){		
		System.out.println("state===============>"+state);			
		HttpSession ses = req.getSession(false);				
		String page="";
		
		if(ses.getAttribute("user") == null){
			//로그인 페이지로 
			System.out.println("세션 없을 때");
			page="login";
		}else{
			//ses에 있는 user 정보를 db에서 불러와서 mypage로
			//db에서 불러올 필요가 있나? 세션에 있는데??????
			System.out.println("세션 있을 때");
			page="mypage";
		}
		return page;
	}
	
	@RequestMapping(value="/mypageUpdate", method=RequestMethod.POST)
	public String update(HttpServletRequest req){
		System.out.println("여기는 /mypageUpdate==============");
		return "mypageUpdate";
		
	}
	
	@RequestMapping(value="/mypageDBUpdate", method=RequestMethod.POST)
	public String updateDB(HttpServletRequest req, MemberDTO member){
		System.out.println("여기는 DBUpdate==============");
		System.out.println(member.getId());
		service.mypageUpdate(member);
		
		HttpSession ses = req.getSession(false);
		if(ses!=null){
			ses.setAttribute("user",member);			
		}
		
		return "mypage";
		
	}
	
	@RequestMapping(value="/mypageDelete", method=RequestMethod.GET)
	public String deleteDB(HttpServletRequest req){
		System.out.println("여기는 회원탈퇴==============");
		
		
		HttpSession ses = req.getSession(false);
		MemberDTO member = (MemberDTO)ses.getAttribute("user");
		String id = member.getId();
		
		service.memberLeave(id);
		ses.invalidate();
		
		return "redirect:/index.do";
		
	}
	
}
