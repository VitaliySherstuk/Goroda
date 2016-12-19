package by.htp.logic;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class CityGameTestFive {

	CityGame logic = new CityGame();
	
	
	@Before
	public void method()
	{
		logic.methodStart("÷");
		logic.methodStart("÷");
		
	}
	
	@Test
	public void testMethodStart()
	{
		assertEquals("STOP",logic.methodStart("÷"));
	}

}
