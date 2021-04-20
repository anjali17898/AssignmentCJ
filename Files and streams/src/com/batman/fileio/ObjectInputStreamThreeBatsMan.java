package com.batman.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamThreeBatsMan {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("records.dat"));
		Batman[] bArray = new Batman[3];
		for (int i = 0; i < 3; i++) {
			bArray[i] = (Batman) ois.readObject();
		}
		for (Batman b : bArray) {
			System.out.println(b);
		}
	}
}
