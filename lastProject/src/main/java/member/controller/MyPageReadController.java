package member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyPageReadController {
	
	@RequestMapping(value="/mypageRead", method=RequestMethod.GET)
	public String InsertDb(HttpServletRequest req){
		HttpSession ses = req.getSession(false);
		System.out.println("여기는 MyPageRead>>>>>>>>>>>>>>>>>>>>>>>>>>");
		String page="";
		
		if(ses.equals(null)){
			//로그인 페이지로 
			System.out.println("세션 없을 때");
			page="login";
		}else{
			//ses에 있는 user 정보를 db에서 불러와서 mypage로
			//db에서 불러올 필요가 있나? 세션에 있는데??????
			System.out.println("세션 있을 때");
			page="myPage";
		}
		return page;
	}
}
