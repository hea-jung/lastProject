package member.dao;

import member.dto.MemberDTO;

public interface MemberDAO {
	int signup(MemberDTO member);
	MemberDTO login(MemberDTO member);
	boolean idcheck(String id);
	
	void mypageUpdate(MemberDTO member);
	void memberLeave(String id);

}
