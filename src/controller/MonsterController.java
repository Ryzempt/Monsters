package controller;

import model.MarshmelloMonster;
import javax.swing.JOptionPane; 
import java.util.Scanner;

public class MonsterController
{
	//Data member section
	private MarshmelloMonster myMonster;
	
	//Constructor section
	public MonsterController()
	{
		//Job 1: Initialize Data Members
		myMonster= new MarshmelloMonster("Repzemption", 3.0, 2, true, 2);
		Scanner inputScanner = new Scanner(System.in);
	}
	
	//methods section
	public void start()
	{
		JOptionPane.showMessageDialog(null, "Show message here :D");
		//Use this method instead of println
		
		JOptionPane.showMessageDialog(null, myMonster);
		myMonster.setArmCount(9999);
		JOptionPane.showMessageDialog(null, "My Monster has this many arms: " + myMonster.getArmCount());
		
		//make new monster and customize
		MarshmelloMonster userMonster = new MarshmelloMonster();
	
		String userMonsterName = JOptionPane.showInputDialog(null, "What is your Monster's name?");	
		String userNumber = JOptionPane.showInputDialog(null, "How many arms?");
		if (validInt(userNumber))
		userMonster = new MarshmelloMonster("Im big Dumb");
		{
			int arms = Integer.parseInt(userNumber);
			userMonster.setArmCount(arms);
		}
	}
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type an integer value like 2");
		}
		return isValid;
	}
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value");
		}
		
		return isValid;
	
	}
}
