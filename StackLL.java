class StackLL{
	Node top;
	StackLL(){
		top=null;
	}
	
	class Node{
		Node next;
		int data;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	void push(int data){
		Node newNode = new Node(data);
		newNode.next=top;
		top=newNode;
	}
	int pop(){
		if(top==null){
			return -1;
		}
		int val=top.data;
		top=top.next;
		return val;
	}
	int peek(){
		if(top==null){
			return -1;
		}
		return top.data;
	}
	void display(){
		if(top==null){
			return;
		}
		Node temp=top;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		StackLL list = new StackLL();
	}
	
}