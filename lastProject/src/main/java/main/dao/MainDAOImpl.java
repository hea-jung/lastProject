package main.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import main.dto.MainDTO;
@Repository
public class MainDAOImpl implements MainDAO {
	@Autowired
	SqlSession sqlsession;
	
	@Override
	public MainDTO mainlist(String region) {
		return sqlsession.selectOne("main.mainlist",region);
	}

	@Override
	public List<MainDTO> mainchecklist(String check) {
		return sqlsession.selectList("main.mainchecklist", check);
	}

}
