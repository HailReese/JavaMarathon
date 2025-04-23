package day10.Task1;

public class BinaryTreeNode {

	public BinaryTreeNode(int value) {
		this.key = value;
		left = rigth = null;
	}

	BinaryTreeNode left;
	BinaryTreeNode rigth;
	private int key;

	public int getKey() {
		return key;
	}
}
