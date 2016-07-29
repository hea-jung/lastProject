package main.dao;

import java.util.List;

import main.dto.MainDTO;

public interface MainDAO {
	MainDTO mainlist(String region);
	List<MainDTO> mainchecklist(String check);
}
