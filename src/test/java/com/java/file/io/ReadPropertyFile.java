package com.java.file.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		//To get the root folder path in the computer
		String rootFolderPath = System.getProperty("user.dir");
		
		//To read the file into FileReader object so that we can load this fileObj into props object
		FileReader myFileObj = new FileReader(rootFolderPath+"/src/test/resources/appData.properties");
		
		//Creating props object
		Properties props = new Properties();
		
		//loading fileObject into props object
		props.load(myFileObj);
		
		System.out.println(props.getProperty("appBrowser"));
		System.out.println(props.getProperty("appUrl"));
		System.out.println(props.getProperty("appUserEmailID"));
		System.out.println(props.getProperty("apppassword"));
		System.out.println(props.getProperty("appUserName"));
		
		System.out.println(props.getProperty("invalid_key")); //it prints null that means this key is invalid
		
	}

}
