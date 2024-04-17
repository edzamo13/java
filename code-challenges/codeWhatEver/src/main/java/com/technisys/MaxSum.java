package com.technisys;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSum {

	public static int findMaxSum(List<Integer> list) {
		// return list.stream().reduce(0, Integer::sum);
		
	//	list.stream().sorted().collect(Collectors.toList()).stream().mapToInt(i->i).sum();
		
		
	return list.stream().sorted().collect(Collectors.toList()).stream().mapToInt(i->i).sum();
		

	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 9, 7, 11);
		System.out.println(findMaxSum(list));
	}

}
