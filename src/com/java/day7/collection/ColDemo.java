package com.java.day7.collection;


	import java.util.ArrayList;

	public class ColDemo {

		public static void main(String[] args) {

			int[] arr = new int[5];
			System.out.println(arr[4]);
	//g	int[] arr = new int[5];
//		System.out.println(arr[4]);

			ArrayList myList = new ArrayList();

			App obj = new App();

			System.out.println(myList);
			System.out.println(myList.size());
			myList.add(10);
			myList.add(10.5);
			myList.add("abc");
			myList.add(new App());
			myList.add(obj);

			System.out.println(myList);

			System.out.println(myList.get(2));
			System.out.println(myList.size());
			myList.add("aaa");
			System.out.println(myList);
			System.out.println(myList.size());
			myList.remove(2);
			System.out.println(myList);
			System.out.println(myList.size());

			ArrayList myList2 = new ArrayList();
			myList2.add(22);
//			myList2.add(myList); // comment out the next line 
			myList2.addAll(myList); // comment out the previ
			myList2.add("www");
			System.out.println(myList2);
			System.out.println(myList2.size());

		}

}
