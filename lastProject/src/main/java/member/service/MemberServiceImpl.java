package member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDAO dao;

	@Override
	public int signup(MemberDTO member) {		
		return dao.signup(member);
	}

	@Override
	public MemberDTO login(MemberDTO member) {				
		return dao.login(member);
	}

	@Override
	public boolean idcheck(String id) {
		return dao.idcheck(id);
	}

	@Override
	public void mypageUpdate(MemberDTO member) {
		dao.mypageUpdate(member);		
	}

	@Override
	public void memberLeave(String id) {
		dao.memberLeave(id);
		
	}

}
