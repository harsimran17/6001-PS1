package lec3.sort.insertion.CLRS;

import java.util.List;

public class SelectionSort {
	public List<Integer> selectionSort(List<Integer> input){
		int size = input.size();
		for (int i = 0; i < size; i++) {
			int indexOfSmallestElement = findSmallest(input.subList(i,size))+i;
			int temp=input.get(i);
			input.set(i, input.get(indexOfSmallestElement));
			input.set(indexOfSmallestElement, temp);
		}
		return input;
		
	}
	public int findSmallest(List<Integer> input){
		Integer indexOfMaxElement=0;
		for (Integer i : input) {
			if(i>input.get(indexOfMaxElement))
				indexOfMaxElement=input.indexOf(i);
		}
		return indexOfMaxElement;
	}
} 
