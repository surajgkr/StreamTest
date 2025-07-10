package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CaseInsensitiveDistinctWordCount {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java","JAVA","hello","world");
		
		long count = words.stream()
			.map(x -> x.toLowerCase())
			.distinct()
			.count();
		System.out.println(count);
			
			
//		
	}

}
