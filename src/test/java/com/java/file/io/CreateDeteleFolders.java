package com.java.file.io;

import java.io.File;
import java.io.IOException;

public class CreateDeteleFolders {

	public static void main(String[] args) throws IOException {
		
		String rootFolderPath = System.getProperty("user.dir");
		System.out.println("project root Folder: "+ rootFolderPath);
		
		File myFileObj = new File (rootFolderPath+"/src/test/resources/MyFolder1");
		if(myFileObj.mkdir()) {
			System.out.println("new folder created");
		}
		else if(myFileObj.exists()) {
			System.out.println("Folder already exists");
			myFileObj.delete();
			System.out.println("So folder is deleted now and creating a new folder");
			myFileObj.mkdir();
		}
		
		File myFileObj2 = new File (rootFolderPath+"/src/test/resources/MyDocument.pdf");
		if(myFileObj2.createNewFile()) {
			System.out.println("new file created");
		}
		else if(myFileObj2.exists()) {
			System.out.println("pdf file file already exists");
			myFileObj2.delete();
			System.out.println("So file is deleted now and creating a new pdf file");
			myFileObj2.createNewFile();
		}

	}

}
