package by.htp.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CityGameTestThree {

	CityGame logic;
	
	@Before
	public void beforeGetWord()
	{
		logic = new CityGame();
		logic.findCity('ю');
	}
	
	@Test
	public void testGetWord()
	{
		assertEquals("Южно-Сахалинск", logic.getWordCityComputer());
	}

}
