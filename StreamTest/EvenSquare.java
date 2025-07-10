package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenSquare {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> evenNum = nums.stream()
			.filter(x -> x%2 ==0)
			.map(x -> x*x)
			.collect(Collectors.toList());
		evenNum.forEach(System.out::println);
	}

}
