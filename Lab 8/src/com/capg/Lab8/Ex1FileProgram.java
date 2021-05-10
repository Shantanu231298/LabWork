package com.capg.Lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex1FileProgram {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("D:\\CAPG-COREJAVA-WORKSPACE\\Labbook-ShubhamKumarSharma\\source.txt");
		FileOutputStream fo = new FileOutputStream("D:\\CAPG-COREJAVA-WORKSPACE\\Labbook-ShubhamKumarSharma\\target.txt");
		Ex1CopyDataThread c = new Ex1CopyDataThread(fi, fo);
		c.start();
	}
} 