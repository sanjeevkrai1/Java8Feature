package com.handle.exception;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Client4 {

	public static void main(String args[]) {
		
		List<Integer> numbers = Arrays.asList(1,2,0,4,5,6,7,8);
		
		numbers.forEach(e-> {
			try {
				writeToFile(e);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		
		
	}

	private static void writeToFile(Integer e) throws IOException {	
		Path path = Paths.get("D:/output.txt");
		 
		try (BufferedWriter writer = Files.newBufferedWriter(path)){
		    writer.write(String.valueOf(e));
		}
	}

}
