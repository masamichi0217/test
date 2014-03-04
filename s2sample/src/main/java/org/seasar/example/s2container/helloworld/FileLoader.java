package org.seasar.example.s2container.helloworld;

import java.util.ArrayList;
import java.util.List;

public class FileLoader {

	private String fileName;
	private String fileName2;
	private List<String> fileNames = new ArrayList<String>();
	
	
	public FileLoader(String fileName){
		this.fileName = fileName;
		System.out.println(this.fileName);
	}

	//setterメソッドの名前を見てインジェクションしてるらしい。このとき、メソッド名のsetほにゃららの最初が大文字でないと探してくれない。
	public void setTest(String fileName)
	{
		this.fileName2 = fileName;
		System.out.println(this.fileName2);
	}
	
	//メソッドインジェクション。これはわかりやすい。
	public void addFileName(String fileName){
		this.fileNames.add(fileName);
		System.out.println(fileNames.get(0));
		System.out.println(fileName);
	}
	
}
