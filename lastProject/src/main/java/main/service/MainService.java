package main.service;

import java.util.List;

import main.dto.MainDTO;

public interface MainService {
	MainDTO mainlist(String region);//�α��� ���� ���� ���
	List<MainDTO> mainchecklist(String check);//�α��ε� ���
}
