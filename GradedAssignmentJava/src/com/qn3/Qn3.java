package com.qn3;

import java.util.ArrayList;
import java.util.List;

public class Qn3 {
	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<>();

		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		List<Integer> oddNums = arr.stream().filter(temp -> temp % 2 != 0).toList();

		List<Integer> squareNums = oddNums.stream().map(temp -> temp * temp).toList();

		int sum = squareNums.stream().mapToInt(temp -> temp).sum();

		System.out.println(sum);

	}

}
