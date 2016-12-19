package by.htp.runner;

import java.util.Scanner;
import java.util.regex.Pattern;

import by.htp.entity.City;
import by.htp.logic.CityGame;

public class Main {

	public static void main(String[] args) {

		CityGame game = new CityGame();
		boolean flag=false;
		String wordCityComputer=null;
		String wordUser = null;
		String exit = "STOP";
		
		Scanner sc = new Scanner(System.in);
		while(!flag)
		{
			System.out.println("Введите город");
			
				wordUser = sc.next();
			
				
			
			if(wordUser!=null & wordUser.equals(exit))
			{
				flag=true;
				break;
			}
			else if(wordCityComputer!=null && wordUser.equals(exit)==false)
			{
				boolean checkInBlackList = game.checkWordUser(wordUser);
				boolean checkWordAndLetter = game.checkCityAndLetter(wordCityComputer, wordUser);
				String resultOfCheck = game.resultCheck(wordUser, checkInBlackList, checkWordAndLetter);
				if(resultOfCheck.equals("STOP"))
				{
					System.out.println("Вы выграли");
					flag=true;
				}
				else if(checkInBlackList==true && checkWordAndLetter==true)
				{
					System.out.println(resultOfCheck);
					wordCityComputer=resultOfCheck;
				}
				else
				{
					System.out.println(resultOfCheck);
				}
			}
			else if(wordCityComputer==null && wordUser.equals(exit)==false)
			{
				boolean checkInBlackList = game.checkWordUser(wordUser);
				String resultOfCheck = game.resultCheck(wordUser, checkInBlackList);
				if(resultOfCheck.equals("STOP"))
				{
					System.out.println("Вы выграли");
					flag=true;
				}
				else if(checkInBlackList==true)
				{
					System.out.println(resultOfCheck);
					wordCityComputer=resultOfCheck;
				}
				else
				{
					System.out.println(resultOfCheck);
				}
			}
			
		}
	}

}
