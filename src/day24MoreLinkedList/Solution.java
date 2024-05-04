package day24MoreLinkedList;

import java.util.HashSet;
import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}

public class Solution {

	 public static Node removeDuplicates(Node head) {
		 if (head == null) {
	            return null; // La liste est vide
	        }

	        HashSet<Integer> uniqueValues = new HashSet<>();
	        Node current = head;
	        Node previous = null;

	        while (current != null) {
	            int currentValue = current.data;

	            // Vérifier si la valeur est déjà présente dans l'ensemble
	            if (uniqueValues.contains(currentValue)) {
	                // La valeur est un doublon, supprimer le nœud actuel
	                previous.next = current.next;
	            } else {
	                // La valeur n'est pas un doublon, l'ajouter à l'ensemble
	                uniqueValues.add(currentValue);
	                previous = current;
	            }

	            // Passer au nœud suivant dans la liste
	            current = current.next;
	        }

	        return head;

	    }

		 public static  Node insert(Node head,int data)
	     {
	        Node p=new Node(data);			
	        if(head==null)
	            head=p;
	        else if(head.next==null)
	            head.next=p;
	        else
	        {
	            Node start=head;
	            while(start.next!=null)
	                start=start.next;
	            start.next=p;

	        }
	        return head;
	    }
	    public static void display(Node head)
	        {
	              Node start=head;
	              while(start!=null)
	              {
	                  System.out.print(start.data+" ");
	                  start=start.next;
	              }
	        }
	        public static void main(String args[])
	        {
	              Scanner sc=new Scanner(System.in);
	              Node head=null;
	              int T=sc.nextInt();
	              while(T-->0){
	                  int ele=sc.nextInt();
	                  head=insert(head,ele);
	              }
	              head=removeDuplicates(head);
	              display(head);

	       }
}
