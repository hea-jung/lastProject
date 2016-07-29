package member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import member.service.MemberService;

@Controller
public class IdCheckController {
	@Autowired
	MemberService service;
		
	@RequestMapping(value="/idcheck", method=RequestMethod.POST)
	public void IdCheck(HttpServletRequest req, HttpServletResponse res,String id ) throws JSONException, IOException{
		System.out.println(id);
		boolean state = service.idcheck(id);
		String result="";
		if(state){
			result="사용 가능 아이디";
		}else{
			result="사용 불가능 아이디";			
		}
		
		JSONObject json = new JSONObject();
		json.put("state", state);
		json.put("result", result);
		
		res.setContentType("application/json;charset=utf-8");
		
		PrintWriter pw = res.getWriter();
		pw.print(json);
		
		
	}
	
	
	

}
