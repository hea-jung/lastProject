package main.service;

import java.util.List;

import main.dto.MainDTO;

public interface MainService {
	MainDTO mainlist(String region);//로그인 하지 않은 경우
	List<MainDTO> mainchecklist(String check);//로그인된 경우
}
