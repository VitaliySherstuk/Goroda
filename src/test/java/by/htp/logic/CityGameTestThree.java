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
		logic.findCity('�');
	}
	
	@Test
	public void testGetWord()
	{
		assertEquals("����-���������", logic.getWordCityComputer());
	}

}
