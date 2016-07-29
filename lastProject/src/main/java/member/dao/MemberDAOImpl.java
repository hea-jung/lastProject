package member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import member.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	SqlSession sqlSession;
	

	@Override
	public int signup(MemberDTO member) {
		
		int result = sqlSession.insert("member.signup", member);
		System.out.println(result);
		if(result > 0){
			System.out.println("회원가입성공");
		}else{
			System.out.println("회원가입 실패");
		}		
		return 0;
	}


	@Override
	public MemberDTO login(MemberDTO member) {
		MemberDTO user = sqlSession.selectOne("member.login", member);
		if(user == null){
			System.out.println("없는 회원");
		}else{
			System.out.println("로그인 성공");
		}
		return user;
	}


	@Override
	public boolean idcheck(String id) {
		MemberDTO result = sqlSession.selectOne("member.idcheck", id);
		if(result == null){
			return true;//가능
		}else{
			return false;//불가능
		}
	}


	@Override
	public void mypageUpdate(MemberDTO member) {
		int result = sqlSession.update("member.mypageupdate", member);
		if(result >0){
			System.out.println("업데이트 성공");
		}else{
			System.out.println("업데이트 실패");
		}
		
	}


	@Override
	public void memberLeave(String id) {
		sqlSession.delete("member.delete", id);
		
	}

}
