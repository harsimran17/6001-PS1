package lec3.sort.insertion;

import java.util.Iterator;
import java.util.List;

public class InPlaceIncSort {

	public List<Integer> increasingOrderSort(List<Integer> input) {
		for (int i = 1; i < input.size(); i++) {
			int key = input.get(i);
			int j = i - 1;
			while (j >= 0 && input.get(j) > key) {
				input.set(j + 1, input.get(j));
				j -= 1;
			}
			input.set(j + 1, key);
		}
		return input;
	}
	
	public List<Integer> decreasingOrderSort(List<Integer> input){
		for (int i = 1; i < input.size(); i++) {
			int key = input.get(i);
			int j = i - 1;
			while (j >= 0 && input.get(j) < key) {
				input.set(j + 1, input.get(j));
				j -= 1;
			}
			input.set(j + 1, key);
		}
		return input;
	}
}
