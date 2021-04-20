package com.batman.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamOneBatsMan {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Batman bt1 = new Batman(101, "Virat", 120, 720, 4587621);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("records.dat"));
		oos.writeObject(bt1);
	}
}