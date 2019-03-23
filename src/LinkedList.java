public class LinkedList {
	public Node head;
	
	public void makeNode(int num){
		if(head == null){
			head = new Node(num);
		} else {
			Node at = findPosition(num);
			insertBefore(at,num);
		}
	
	}

	public void insertAfter(Node n, int num){
		if(n.next == null){
			n.next = new Node(num);
		} else {
			Node temp = n.next;
			
			Node toInsert = new Node(num);
			toInsert.next = temp;
			
			n.next = toInsert;	
		}		
	}
	
	public void removeNode(Node n){
		if(n == head){
			head = head.next;
		} else {
			Node prev = getPrev(n);
			Node next = n.next;
			prev.next = next;
		}		
	}
	
	public void insertBefore(Node n, int num){
		if(n == head){
			Node temp = new Node(num);
			temp.next = this.head;
			this.head = temp;
		} else {
			Node temp = getPrev(n);
			insertAfter(temp,num);	
		}
	}
	
	public Node getPrev(Node n){
		Node temp = head;
		if(head == n){
			System.out.println("Can't go previous to head");
			return null;
		}
		while(temp.next != null){
			if(temp.next.equals(n)){
				return temp;
			}
			temp = temp.next;
		}
		return temp;
	}
	
	public Node findPosition(int num){
		if(head == null){
			return head;
		} else {
			Node temp = head;
			while(temp.next != null){
				if(temp.data == num){
					return temp;
				} else {
					temp = temp.next;
				}
			}
			return null;
		}
	}
	
	public void showList(){
		Node temp = head;
		System.out.println("");
		if(temp == null){
			System.out.println("Empty List. ");
		} else {	
			while(temp != null){
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	
	public Node findTail(){
		if(head == null){
			return head;
		} else {
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			return temp;
		}
	}
	
	
	public void inIt(){
		this.head = null;
	}

}