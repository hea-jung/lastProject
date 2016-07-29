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
			System.out.println("ȸ�����Լ���");
		}else{
			System.out.println("ȸ������ ����");
		}		
		return 0;
	}


	@Override
	public MemberDTO login(MemberDTO member) {
		MemberDTO user = sqlSession.selectOne("member.login", member);
		if(user == null){
			System.out.println("���� ȸ��");
		}else{
			System.out.println("�α��� ����");
		}
		return user;
	}


	@Override
	public boolean idcheck(String id) {
		MemberDTO result = sqlSession.selectOne("member.idcheck", id);
		if(result == null){
			return true;//����
		}else{
			return false;//�Ұ���
		}
	}


	@Override
	public void mypageUpdate(MemberDTO member) {
		int result = sqlSession.update("member.mypageupdate", member);
		if(result >0){
			System.out.println("������Ʈ ����");
		}else{
			System.out.println("������Ʈ ����");
		}
		
	}


	@Override
	public void memberLeave(String id) {
		sqlSession.delete("member.delete", id);
		
	}

}
