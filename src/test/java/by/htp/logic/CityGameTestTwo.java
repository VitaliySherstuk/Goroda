package by.htp.logic;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CityGameTestTwo {

	private static CityGame logic;
	private final static char RESULT_TRUE='א';
	private String value;
	
	public CityGameTestTwo(String value)
	{
		this.value=value;
	}
	
	@Parameters
	public static ArrayList<String> setOfParameters()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("אü");
		list.add("אי");
		list.add("את");
		list.add("אû");
		list.add("שא");
		return list;
	}

	@Test
	public void testgetLastCorrectChar()
	{
		logic = new CityGame();
		assertEquals(RESULT_TRUE, logic.getLastCorrectChar(value));
	}
}
