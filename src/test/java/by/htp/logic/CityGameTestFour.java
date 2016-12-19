package by.htp.logic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CityGameTestFour {

	CityGame logic = new CityGame();;
	@Before
	public void toList()
	{
		
		logic.cityNoUse.add("Анапа");
	}

	@Test
	public void testCheckWordUser()
	{
		assertFalse(logic.checkWordUser("Анапа"));
	}
}
