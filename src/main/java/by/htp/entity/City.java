package by.htp.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
	
	private String[] arrayCity ={"�����", "������", "������", "����", "����", "������", "�����", "����", "������", "������",
			"������", "������", "�������", "�������", "�����", "�������", "�������", "������", "������� ", "�������", "������",
			"�����", "������", "������", "������", "����", "������", "���-�����", "���������", "����", "�����", "����", "������",
			"�����", "��������", "����", "������", "����", "�����", "������", "�����", "���", "������", "������", "��������",
			"������", "��������", "�����", "����", "�������", "�����", "���", "����-���", "������", "������", "�������",
			"�������", "����������", "��������", "������", "�����", "������", "��������", "��-����", "��������", "����-���������",
			"����", "������", "���������"};	
	
	private List<String> listCity = new ArrayList<String>(Arrays.asList(arrayCity));
	
	public List<String> getListCity()
	{
		return listCity;
	}
	public void setListCity(List<String> listCity)
	{
		this.listCity = listCity;
	}
}
