package Application;

import java.util.Scanner;

import Entities.AdtLinkedList;
import Entities.Node;

public class Program {

	public static void main(String[] args) {
		AdtLinkedList list = new AdtLinkedList();

        Scanner scn = new Scanner(System.in);

        while (true) {
        	System.out.println("\n");
            System.out.println("0 - Exit");
            System.out.println("1 - Insert a new element on the head");
            System.out.println("2 - Insert a new element on the tail");
            System.out.println("3 - Change the element at specific position");
            System.out.println("4 - Insert a new element at specific position");
            System.out.println("5 - Remove an element");
            System.out.println("6 - Count of nodes");
            System.out.println("7 - Print the LinkedList");

            System.out.println("\n");
            System.out.print("Choose an option: ");
            int ch = scn.nextInt();

            int num;
            
            switch(ch) {
            	case 0:
            		System.out.println("End");
					System.exit(0);
            		break;
            		
            	case 1:
            		System.out.print("Inform a number: ");
                    num = scn.nextInt();
                    
                    Node e = new Node(num);
                    
                    list.insertAtHead(e);
            		break;
            		
            	case 2:
            		System.out.print("Inform a number: ");
                    num = scn.nextInt();
                    
                    Node n = new Node(num);
                    
                    if (list.isEmpty()) 
                    	list.insertAtHead(n);
                    else
                    	list.insertAtTail(n);
                    
            		break;
            		
            	case 3:
            		System.out.print("Inform a number: ");
                    num = scn.nextInt();
                    
                    System.out.print("Informe the position: ");
                    int pos = scn.nextInt();
                    
                    Node d = new Node(num);
                    
                    list.changeAtPosition(d, pos);
                    
                    System.out.println(list.printList());
            		break;
            		
            	case 4:
            		System.out.print("Inform a number: ");
                    num = scn.nextInt();
                    
                    System.out.print("Informe the position: ");
                    int position = scn.nextInt();
                    
                    Node node = new Node(num);
                    
                    list.insertAtPosition(node, position);
                    
                    System.out.println(list.printList());
            		break;
            		
            	case 5:
            		System.out.print("\nInform a number: ");
                    int posi = scn.nextInt();
                                    
                    list.deleteAtPosition(posi);
                    
                    System.out.println(list.printList());
            		break;
            		
            	case 6:
            		System.out.println(list.getCount());
            		break;
            		
            	case 7:
            		 System.out.println(list.printList());
            		break;
            		
            	default:
            		break;
            }
        }
    }
}
