package com.aurionpro.StreamTestS;

import java.util.*;
import java.util.stream.*;

public class PrimePartitioning {

	public static void main(String[] args) {

		List<Integer> input = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> primesSoFar = new ArrayList<>();

		Map<Boolean, List<Integer>> result = input.stream().collect(Collector.of(() -> {
			Map<Boolean, List<Integer>> map = new HashMap<>();
			map.put(true, new ArrayList<>());
			map.put(false, new ArrayList<>());
			return map;
		},
			(map, number) -> {
			boolean isPrime = number > 1;
			int sqrt = (int) Math.sqrt(number);
			for (int prime : primesSoFar) {
				if (prime > sqrt)
					break;
				if (number % prime == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				map.get(true).add(number);
				primesSoFar.add(number);
			} else {
				map.get(false).add(number);
			}
		},
			(map1, map2) -> {
			map1.get(true).addAll(map2.get(true));
			map1.get(false).addAll(map2.get(false));
			return map1;
		}));

		System.out.println("Primes: " + result.get(true));
		System.out.println("Non-Primes: " + result.get(false));
	}
}
