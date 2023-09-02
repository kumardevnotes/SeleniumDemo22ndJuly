package com.java.file.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextDocumentDemo {

	public static void main(String[] args) throws IOException {
		//To get the root folder path in the computer
		String rootFolderPath = System.getProperty("user.dir");
		
		//loading text doc into fileObjusing FileReader class
		FileReader myFileObj = new FileReader(rootFolderPath+"/src/test/resources/ApplicationData.txt");
		
		System.out.println(":Before writing the data into text document:");
		int charPosition;
		while((charPosition = myFileObj.read()) != -1) {
			System.out.print((char)charPosition);
		}
		System.out.println();
		
		
		//loading text doc into file Objusing FileWriter class to write data into the document
		FileWriter myFileObj2 = new FileWriter(rootFolderPath+"/src/test/resources/ApplicationData.txt");
		myFileObj2.write("This is a new content written inside the document Applicationdata.txt");
		myFileObj2.close();
		
		myFileObj = new FileReader(rootFolderPath+"/src/test/resources/ApplicationData.txt");
		
		System.out.println(":After writing the data into text document:");
		System.out.println();
		while((charPosition = myFileObj.read()) != -1) {
			System.out.print((char)charPosition);
		}
	}

}
