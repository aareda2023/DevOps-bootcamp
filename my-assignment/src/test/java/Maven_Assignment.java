package com.assignment;
import static org.junit.Assert.*;

public class Maven_Assignment {
	public int square(int x) {
		return x*x;
	}
	public int countN(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)=='n'|| word.charAt(i)=='N') {
				count++;
			}
		}
		return count;
	}

}
