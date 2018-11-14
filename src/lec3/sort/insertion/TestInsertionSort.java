package lec3.sort.insertion;

import java.util.ArrayList;

public abstract class TestInsertionSort {

	public static void main(String[] args) {
		InPlaceIncSort obj = new InPlaceIncSort();
		
		int[] arr = {5, 2, 4, 6, 1, 3};
		ArrayList<Integer> inp = new ArrayList<>() ;
		for (int i = 0; i < arr.length; i++) {
			inp.add(arr[i]);
		}
		System.out.println(obj.decreasingOrderSort(inp));
	}

}
