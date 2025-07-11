package com.aurionpro.wordGuesser;

import java.util.*;
import java.util.stream.IntStream;

public class WordGuesser {

	public static void main(String[] args) {

		List<String> wordList = Arrays.asList("java", "stream", "object", "method", "inheritance");
		String word = wordList.get(new Random().nextInt(wordList.size())).toLowerCase();

		char[] blanks = new char[word.length()];
		Arrays.fill(blanks, '_');

		Set<Character> guessedLetters = new HashSet<>();
		int lives = 6;

		Scanner scanner = new Scanner(System.in);

		while (lives > 0 && new String(blanks).contains("_")) {
			System.out.println("\nWord: " + new String(blanks));
			System.out.println("Lives left: " + lives);
			System.out.print("Guess a letter: ");
			String input = scanner.nextLine().toLowerCase();

			if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
				System.out.println("Please enter a single valid letter.");
				continue;
			}

			char guess = input.charAt(0);

			if (guessedLetters.contains(guess)) {
				System.out.println("You've already guessed that letter.");
				continue;
			}

			guessedLetters.add(guess);

			if (word.indexOf(guess) >= 0) {
				System.out.println("Correct!");
				
				IntStream.range(0, word.length()).filter(i -> word.charAt(i) == guess).forEach(i -> blanks[i] = guess);
			} else {
				System.out.println("Wrong guess.");
				lives--;
			}
		}

		if (!new String(blanks).contains("_")) {
			System.out.println("\nCongratulations! You guessed the word: " + word);
		} else {
			System.out.println("\nGame Over! The word was: " + word);
		}

		scanner.close();
	}

}
