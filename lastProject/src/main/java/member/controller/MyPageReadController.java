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
		System.out.println("����� MyPageRead>>>>>>>>>>>>>>>>>>>>>>>>>>");
		String page="";
		
		if(ses.equals(null)){
			//�α��� �������� 
			System.out.println("���� ���� ��");
			page="login";
		}else{
			//ses�� �ִ� user ������ db���� �ҷ��ͼ� mypage��
			//db���� �ҷ��� �ʿ䰡 �ֳ�? ���ǿ� �ִµ�??????
			System.out.println("���� ���� ��");
			page="myPage";
		}
		return page;
	}
}
