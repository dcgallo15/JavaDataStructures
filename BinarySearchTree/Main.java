class Main {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(10);
		tree.insert(2, tree.getRoot());
		tree.insert(3, tree.getRoot());
		tree.insert(1, tree.getRoot());
		tree.insert(4, tree.getRoot());
		tree.insert(11, tree.getRoot());
		tree.inOrder(tree.getRoot());
		tree.delete(10);
		System.out.println("-------------");
		tree.inOrder(tree.getRoot());
		System.out.println("-------------");
		tree.preOrder(tree.getRoot());
		System.out.println("-------------");
		tree.postOrder(tree.getRoot());
	}
}
