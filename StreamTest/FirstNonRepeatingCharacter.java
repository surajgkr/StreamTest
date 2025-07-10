package com.aurionpro.model;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String input = "programmingp";
		char firstNonRepeating = findFirstNonRepeating(input);

		System.out.println(firstNonRepeating);
	}

	public static char findFirstNonRepeating(String str) {
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			boolean isRepeating = false;

			for (int j = 0; j < str.length(); j++) {
				if (i != j && currentChar == str.charAt(j)) {
					isRepeating = true;
					break;
				}
			}

			if (!isRepeating) {
				return currentChar;
			}
		}
		return '0';

	}

}
