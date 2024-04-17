package Minute99;

import java.util.Arrays;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {
		
		//  BinaryTree bt = new createBinaryTree();
		BinaryTree bt= new BinaryTree();
		bt.createBinaryTree();
		bt.traversePostOrder(bt.createBinaryTree().root);
	//	List<Integer> integers= Arrays.asList(1,2,3,4,5,6,7,8);
	//	bt.sort(integers);
	}
}
