package Minute99;

import java.util.Arrays;

public class TreeSort {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println("Original array- " + Arrays.toString(arr));
		Tree tree = new Tree(arr[0]);
		for (int num : arr) {
			tree.insert(tree.node, num);
		}
		System.out.println("Sorted Array (Ascending)- ");
		tree.inOrder(tree.node);
		System.out.println();
		System.out.println("Sorted Array (Descending)- ");
		tree.inOrderDesc(tree.node);
	}

}
