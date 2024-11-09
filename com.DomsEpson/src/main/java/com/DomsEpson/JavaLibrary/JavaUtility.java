package com.DomsEpson.JavaLibrary;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This Class Provides the Reusable Method to Perform Java_Related Actios
 *-By Calling inbuild Methods
 *
 *
 *@author DELL*/

public class JavaUtility {
	
	/**
	 * This Method Used To pause the time
	 * 
	 * @param long time
	 * @return void*/

	public static void pause(long time)
	{
		try {
			Thread.sleep(time);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This Method Used To generateRandomNum
	 * 
	 * @param long time
	 * @return int*/
	public int generateRandomNum(int limit)
	{
		Random random= new Random();
				return random.nextInt(limit);
		
	}
	
	public String getCurrentTime()
	{
		 Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sdf.format(date);
	}}


