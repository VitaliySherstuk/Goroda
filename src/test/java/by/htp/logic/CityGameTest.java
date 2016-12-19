package by.htp.logic;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import by.htp.logic.CityGame;


public class CityGameTest {
	
	private static CityGame logic;
	private final static char RESULT_TRUE='а';
	private static String CITY_USER="Архангельск";
	private static String CITY_COMP="Алушта";
	@Test
	public void testcheckWordUser()
	{
		logic = new CityGame();
		assertTrue(logic.checkWordUser("Анапа"));
	}

	@Test
	public void testMet()
	{
		CityGame cg = new CityGame();
		assertEquals("TT", cg.methodTest());
	}
	@Test
	public void testgetLastCorrectChar()
	{
		logic = new CityGame();
		assertEquals(RESULT_TRUE, logic.getLastCorrectChar("аъ"));
	}
	
	
	@Test
	public void testFindCity()
	{
		logic = new CityGame();
		assertTrue(logic.findCity('ю'));
		//assertEquals("Южно-Сахалинск", logic.getWordCityComputer());
	}

	@Test
	public void testCheckCityAndLetter()
	{
		logic=new CityGame();
		assertTrue(logic.checkCityAndLetter(CITY_COMP, CITY_USER));
	}
	
}
