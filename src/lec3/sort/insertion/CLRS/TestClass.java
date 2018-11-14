package lec3.sort.insertion.CLRS;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int[] arr = {5, 2, 4, 6, 1, 3};
		ArrayList<Integer> inp = new ArrayList<>() ;
		for (int i = 0; i < arr.length; i++) {
			inp.add(arr[i]);
		}
		System.out.println(sort.selectionSort(inp));
	}

}
