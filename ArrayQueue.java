class ArrayQueue{
	int queue[];
	int size, front, rear;
	ArrayQueue(int size){
		this.size=size;
		queue=new int[size];
		front=rear=-1;
	}
	void enqueue(int value){
		if(rear==size-1){
			System.out.println("Overflow in the Queue");
			return;
		}
		if(front==-1){
			front=0;
		}
		queue[++rear]=value;
		 System.out.println(value + " inserted");
	}
	int dequeue(int value){
		if(front==-1 || front>rear){
			System.out.println("Underflow in the Queue");
			return -1;
		}
		int value=queue[front++];
		return val;
	}
	boolean isEmpty(){
		return (front==-1 || front>rear);
	}
	boolean isFull(){
		return (rear==size-1);
	}
	
	
	public static void main(String args[]){
		ArrayQueue queue = new ArrayQueue(10);
		
	}
}