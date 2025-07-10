package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {

	public static void main(String[] args) {
		
		List<String> sentences = Arrays.asList(
				"hello world",
				"good morning",
				"i am good"
				
				);
		
		List<List<String>> flatMap = sentences.stream()
									.map(sentence -> Arrays.asList(sentence.split(" ")))
									.sorted()
									.distinct()
									.collect(Collectors.toList());
		flatMap.forEach(System.out::println);
				
		
	}

}
