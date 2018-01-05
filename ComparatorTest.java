package com.test.java8.lambda_expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public ComparatorTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("g");
		list.add("h");
		list.add("r");
		list.add("i");
		list.add("v");
		list.add("n");
		list.forEach((alphabet)->System.out.print(alphabet));
		System.out.println();
		/*Comparator<String> c1 = (arg1, arg2) -> {
			return arg1.compareTo(arg2);
		};*/

		//data type can be specified or not specified in the parameters.
		//Lambda supports target typing which infers the object type from the context in which it is used.
		Collections.sort(list, (String arg1, String arg2)->{
			return arg1.compareTo(arg2);
		});
		list.forEach((alphabet)->System.out.print(alphabet));
	}

}
