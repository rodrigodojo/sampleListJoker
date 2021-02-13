package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5,2,10);
		printsList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria","Alex","Bob");
		printsList(myStrs);
		
	}

	public static void printsList(List<?> list) {
		for(Object x : list) {
			System.out.println(x);
		}
	}
}
