package by.htp.logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.htp.entity.City;
@RunWith(Parameterized.class)
public class CityGame {

	private String simbol= "йьъзы";
	private char[] arrayCharCity;
	private boolean findCity=false;
	private String wordCityComputer=null;
	List<String> cityNoUse = new ArrayList<String>();
	City city = new City();
	String vasy=null;
	
	public String getWordCityComputer()
	{
		return wordCityComputer;
	}
	
	public char getLastCorrectChar(String word)
	{
		arrayCharCity = word.toCharArray();
		for(int i=word.length()-1; i>=0; i--)
		{
			int number = simbol.indexOf(arrayCharCity[i]);
			if(number==-1)
			{
				return arrayCharCity[i];
			}
			
		}
		
		return '1';
	}
	
	public String methodTest()
	{
		vasy="TT";
		return vasy;
	}
	public boolean findCity(char letter)
	{
		if(letter==-1)
		{
			return false;
		}
		
		//cityUseComp = city.getListCity();
		ListIterator<String> iterator = city.getListCity().listIterator();
		while(iterator.hasNext())
		{
			wordCityComputer=iterator.next();
			char ch = wordCityComputer.toLowerCase().charAt(0);
			if(ch==letter)
			{
				
				
				cityNoUse.add(wordCityComputer);
				deleteListCity(wordCityComputer);
				findCity = true;
				return findCity;
				
			}
			else
			{
				findCity = false;
			}
			
			
		}
		return findCity;
	}
	
	private void deleteListCity(String cityMember)
	{
		ListIterator<String> iterator = city.getListCity().listIterator();
		while(iterator.hasNext())
		{
			if(iterator.next().toLowerCase().equals(cityMember.toLowerCase()))
			{
				iterator.remove();
			}
		}
	}
	public boolean checkWordUser(String wordUser)
	{
		ListIterator<String> iterator = cityNoUse.listIterator();
		boolean checkWord=true;
		while(iterator.hasNext())
		{
			if(iterator.next().toLowerCase().equals(wordUser.toLowerCase()))
			{
				checkWord=false;
			}
		}
		return checkWord;
	}
	public String methodStart(String wordMember)
	{
		String wordComputer=null;
		
			cityNoUse.add(wordMember);
			deleteListCity(wordMember);
			char letterEnd = getLastCorrectChar(wordMember);
			findCity(letterEnd);
			if(findCity)
			{
				wordComputer = wordCityComputer;
			}
			else
			{
				wordComputer="STOP";
			}
			
			return wordComputer;
	}
	public boolean checkCityAndLetter(String wordCityComputer, String wordCityUser)
	{
		boolean checkLetters = false;
		char chComputer = getLastCorrectChar(wordCityComputer);
		
		char chUser = wordCityUser.toLowerCase().charAt(0);
		if(chComputer==chUser)
		{
			checkLetters = true;
		}
		return checkLetters;
	}
	public String resultCheck(String wordUser, boolean checkInBlackList, boolean checkWordAndLetter)
	{
		String resultOfCheck=null;
		if(checkInBlackList==true && checkWordAndLetter==true)
		{
			resultOfCheck = methodStart(wordUser); 
			
		}
		else if(checkInBlackList==true && checkWordAndLetter==false)
		{
			resultOfCheck = "Вы неправильно ввели город. Ваш город должен начинатся на последнюю букву города вашего соперника.";
		}
		else if(checkInBlackList==false && checkWordAndLetter==true)
		{
			resultOfCheck = "Такой город уже был";
		}
		else if(checkInBlackList==false && checkWordAndLetter==false)
		{
			resultOfCheck = "Вы неправильно ввели город. Ваш город должен начинатся на последнюю букву города вашего соперника. И такой город уже был";
		}
		return resultOfCheck;
	}
	public String resultCheck(String wordUser, boolean checkInBlackList)
	{
		String resultOfCheck=null;
		if(checkInBlackList==true)
		{
			resultOfCheck = methodStart(wordUser); 
			
		}
		else if(checkInBlackList==false)
		{
			resultOfCheck = "Такой город уже был";
		}
		return resultOfCheck;
	}
	
}
