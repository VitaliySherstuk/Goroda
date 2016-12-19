package by.htp.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityGameTestSix {

	CityGame logic = new CityGame();
	
	private static boolean TRUE = true;
	private static boolean FALSE = false;
	
	private static String noCorrect = "�� ����������� ����� �����. ��� ����� ������ ��������� �� ��������� ����� ������ ������ ���������.";
	private static String repeat = "����� ����� ��� ���";
	private static String noCorrectAndRepeat = "�� ����������� ����� �����. ��� ����� ������ ��������� �� ��������� ����� ������ ������ ���������. � ����� ����� ��� ���";

	@Test
	public void testResultCheckNoCorrect()
	{
		assertEquals(noCorrect, logic.resultCheck("�", TRUE, FALSE));
	}
	
	@Test
	public void testResultCheckReapeat()
	{
		assertEquals(repeat, logic.resultCheck("�", FALSE, TRUE));
	}
	
	@Test
	public void testResultCheckNoCorrectAndRepeat()
	{
		assertEquals(noCorrectAndRepeat, logic.resultCheck("�", FALSE, FALSE));
	}
	
	
	
}
