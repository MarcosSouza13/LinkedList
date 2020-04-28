package Entities;

public class AdtLinkedList {

	Node head;
	
	public AdtLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Insert a new node as head.
     */
    public void insertAtHead(Node d) {
        d.setNext(head);
        head = d;
    }
    
    /**
     * Insert a new node in the LinkedList by position 
     */
    public void insertAtPosition(Node d, int pos) { 
    	Node tmp = head;
    	int nodeNumbers, posTemp = 1;
    	
    	nodeNumbers = getCount();
    	
    	if (pos < 1)
    		insertAtHead(d);
    	else {
    		if(pos >= nodeNumbers) 
    			insertAtTail(d);
    		else {
    			while(posTemp < (pos - 1)) {
    				tmp.getNext();
    				posTemp = posTemp + 1;			
    			}
    			
    			d.setNext(tmp.getNext());
    			tmp.setNext(d);
    		}
    	}
    }

    /**
     * Insert a new node as the last.
     */
    public void insertAtTail(Node d) {
        if (isEmpty()) {
        	insertAtHead(d);
        } 
        else {
            Node tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(d);
        }
    }
    
    /**
     * Change the data in the LinkedList by position 
     */
    public void changeAtPosition(Node d, int pos) {
    	    	
    	Node node = d;
    	Node tmp = head;
    	
    	if(pos == 0) {	
    		Node nodeTmp = node;
    		nodeTmp.setData(node.getData());
    		return;
    	}
    	
    	if(!isEmpty()){
    		for(int i = 0; i < pos - 1 && node.getNext() != null; i++) {
    			node = node.getNext();
    		}
    		
    		tmp.setNext(node.getNext().getNext());
    		
    		node.getNext().setNext(null);
    		
    		node.setNext(tmp);
    	}
    }

    /**
     * Returns count of nodes in linked list
     */
    public int getCount() {
    	    	
    	 Node tmp = head;
    	 int count = 0;
    	 
	     if (!isEmpty()) {
            while (tmp != null) {
            	count++;
                tmp = tmp.getNext();
            }
	     }

    	 return count;
    }
    
    /**
     * Print contents of LinkedList starting from head
     */
    public String printList() {
        String ret = "[";

        if (!isEmpty()) {
            Node x = head;
            while (true) {
                ret += " " + x.getData();
                if (x.getNext() != null)
                    x = x.getNext();
                else 
                    break;
            }
        }

        ret += "]";
        return ret;

    }
    
    /**
     * Remove an data in the LinkedList by position 
     */
    public void deleteAtPosition(int pos) {
    	Node noCurr = head;
    	Node noPrev = null;
    	
    	if(pos == 0)
    		head = noCurr.getNext();
    	else {
    		for (int i = 0; noCurr != null && i < pos - 1; i++)
    			noCurr.getNext();
    		
    		if (noCurr == null || noCurr.getNext() == null)
    			return;
    		
    		noPrev = noCurr.getNext().getNext();
    		noCurr.setNext(noPrev);
    	}
    }
}
