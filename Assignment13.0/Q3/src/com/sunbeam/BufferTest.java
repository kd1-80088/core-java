package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (FileWriter fw = new FileWriter("file.txt")) {
			try (BufferedWriter bw = new BufferedWriter(fw)) {
				for (int i = 1; i <= 4; i++) {
					System.out.println(" Enter a line : ");
					String line = sc.nextLine();
					bw.write(line);
					bw.newLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done.");
	}

}
