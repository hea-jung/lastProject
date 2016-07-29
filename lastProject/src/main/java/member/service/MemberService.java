package member.service;

import member.dto.MemberDTO;

public interface MemberService {
	int signup(MemberDTO member);
	MemberDTO login(MemberDTO member);
	boolean idcheck(String id);
	
	void mypageUpdate(MemberDTO member);
	void memberLeave(String id);

}
