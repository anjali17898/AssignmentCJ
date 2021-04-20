package com.batman.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamThreeBatsMan {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Batman bt1 = new Batman(101, "Virat", 120, 720, 4587621);
		Batman bt2 = new Batman(101, "Dhoni", 500, 1200, 458762145);
		Batman bt3 = new Batman(101, "Rahul", 30, 420, 587621221);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("records.dat"));
		oos.writeObject(bt1);
		oos.writeObject(bt2);
		oos.writeObject(bt3);
	}
}
