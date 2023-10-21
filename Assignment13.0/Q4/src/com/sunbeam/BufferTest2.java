package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferTest2 {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("/home/sunbeam-pranav/CDAC/My_Git_Data/core-java/Assignment13.0/Q3/file.txt")) {
			try (BufferedReader br = new BufferedReader(fr)) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
