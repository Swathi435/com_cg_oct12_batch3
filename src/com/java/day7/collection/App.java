package com.java.day7.collection;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		int[] arr = new int[5];
		System.out.println(arr[4]);

		ArrayList myList = new ArrayList();

		App obj = new App();

		myList.add(10);
		myList.add(10.5);
		myList.add("abc");
		myList.add(new App());
		myList.add(obj);

		System.out.println(myList);

		System.out.println(myList.get(2));

}
}
