package Entities;

public class Node {

	private int data;
	private Node next;
	
	public Node(int d) {
        this.data = d;
    }

    public int getData() {
        return data;
    }

    public void setData(int d) {
        this.data = d;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node prox) {
        this.next = prox;
    }

}
