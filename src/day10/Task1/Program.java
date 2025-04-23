package day10.Task1;

public class Program {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		BinaryTreeNode root = bt.add(20);
		bt.add(13);
		bt.add(15);
		bt.add(14);
		bt.add(45);
		bt.add(103);
		bt.add(2);
		bt.add(3);

		bt.sortedPrintTree(root);
	}
}
