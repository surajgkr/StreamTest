package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;

public class FlattenAlphabetise {

	public static void main(String[] args) {
		
		List<List<String>> listOfList = Arrays.asList(
				Arrays.asList("hello","ai"),
				Arrays.asList("bye","morning"),
				Arrays.asList("zebra")
				);
			listOfList.stream().flatMap(x -> x.stream().sorted()).sorted().forEach(x -> System.out.println(x));
		
		
	}

}
