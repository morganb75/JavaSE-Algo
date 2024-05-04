package day15LinkedList;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class solution {
	
	// Fonction pour insérer un nouvel élément à la fin de la liste chaînée
	public static  Node insert(Node head,int data) {
	        Node newNode = new Node(data);

	        // Si la liste est vide, le nouvel élément devient la tête de la liste
	        if (head == null) {
	            head = newNode;
	        } else {
	            // Sinon, parcourir la liste jusqu'à la fin et ajouter le nouvel élément
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }

	        // Retourner la référence à la tête de la liste
	        return head;
	    
    }
	
	
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
