package com.Helthcare.base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {

	private static Logger demologger = LogManager.getLogger(Log4j.class.getName());
	
	public static void main(String[] args) {
		
		demologger.info("requestDemopage  click is succesfull");
		demologger.info("Fisrt  Name   enter ");
		demologger.error("DB connection Failed");
		demologger.debug(" this is dubug");

	}

}
