package by.htp.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityGameTestSix {

	CityGame logic = new CityGame();
	
	private static boolean TRUE = true;
	private static boolean FALSE = false;
	
	private static String noCorrect = "Вы неправильно ввели город. Ваш город должен начинатся на последнюю букву города вашего соперника.";
	private static String repeat = "Такой город уже был";
	private static String noCorrectAndRepeat = "Вы неправильно ввели город. Ваш город должен начинатся на последнюю букву города вашего соперника. И такой город уже был";

	@Test
	public void testResultCheckNoCorrect()
	{
		assertEquals(noCorrect, logic.resultCheck("а", TRUE, FALSE));
	}
	
	@Test
	public void testResultCheckReapeat()
	{
		assertEquals(repeat, logic.resultCheck("а", FALSE, TRUE));
	}
	
	@Test
	public void testResultCheckNoCorrectAndRepeat()
	{
		assertEquals(noCorrectAndRepeat, logic.resultCheck("а", FALSE, FALSE));
	}
	
	
	
}
