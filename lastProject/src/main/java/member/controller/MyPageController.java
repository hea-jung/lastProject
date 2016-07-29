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
			//�α��� �������� 
			System.out.println("���� ���� ��");
			page="login";
		}else{
			//ses�� �ִ� user ������ db���� �ҷ��ͼ� mypage��
			//db���� �ҷ��� �ʿ䰡 �ֳ�? ���ǿ� �ִµ�??????
			System.out.println("���� ���� ��");
			page="mypage";
		}
		return page;
	}
	
	@RequestMapping(value="/mypageUpdate", method=RequestMethod.POST)
	public String update(HttpServletRequest req){
		System.out.println("����� /mypageUpdate==============");
		return "mypageUpdate";
		
	}
	
	@RequestMapping(value="/mypageDBUpdate", method=RequestMethod.POST)
	public String updateDB(HttpServletRequest req, MemberDTO member){
		System.out.println("����� DBUpdate==============");
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
		System.out.println("����� ȸ��Ż��==============");
		
		
		HttpSession ses = req.getSession(false);
		MemberDTO member = (MemberDTO)ses.getAttribute("user");
		String id = member.getId();
		
		service.memberLeave(id);
		ses.invalidate();
		
		return "redirect:/index.do";
		
	}
	
}
