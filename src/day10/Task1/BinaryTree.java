package day10.Task1;

public class BinaryTree {
	private long counterOfNodes;
	private BinaryTreeNode root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTreeNode add(int key) {
		counterOfNodes++;
		if (root == null) {
			return root = new BinaryTreeNode(key);
		} else {
			return addTo(root, key);
		}
	}

	private BinaryTreeNode addTo(BinaryTreeNode root, int key) {
		if (key < root.getKey()) {
			if (root.left == null)
				return root.left = new BinaryTreeNode(key);
			else
				return addTo(root.left, key);
		} else {
			if (root.rigth == null)
				return root.rigth = new BinaryTreeNode(key);
			else
				return addTo(root.rigth, key);
		}
	}

	public void sortedPrintTree(BinaryTreeNode root) {
		if (root == null) {
			System.out.println("Дерево пустое");
		} else {
			sortedPrintTreeRec(root);
		}
	}

	private void sortedPrintTreeRec(BinaryTreeNode root) {
		if (root != null) {
			sortedPrintTreeRec(root.left);
			System.err.println(root.getKey());
			sortedPrintTreeRec(root.rigth);
		}
	}

}
