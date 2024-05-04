package day22BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Solution {

	public static int getHeight(Node root) {
		if (root == null) {
			return -1; // arbre vide hauteur -1
		} else {
			int leftHeight = getHeight(root.left);
			int rightHeight = getHeight(root.right);

			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

	public static void levelOrder(Node root) {
		if (root == null) {
			return;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node current = queue.poll();
			System.out.print(current.data + " ");

			if (current.left != null) {
				queue.add(current.left);
			}

			if (current.right != null) {
				queue.add(current.right);
			}
		}

	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println("Hauteur de BST: " + height);
		System.out.println("Arbre en levelorder : ");
		levelOrder(root);
	}
}
