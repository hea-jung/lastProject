package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.MainDAO;
import main.dto.MainDTO;
@Service
public class MainServiceImpl implements MainService {
	@Autowired
	MainDAO dao;
	
	@Override
	public MainDTO mainlist(String region) {
		return dao.mainlist(region);
	}

	@Override
	public List<MainDTO> mainchecklist(String check) {
		return dao.mainchecklist(check);
	}

}
