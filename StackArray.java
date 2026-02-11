class StackArray{
	int size;
	int stack[];
	int top;
	StackArray(int size){
		this.size=size;
		stack=new int[size];
		top=-1;
	}
	void push(int value){
		if(top==size-1){
			System.out.println("Stack Overflowflow");
			return;
		}
	
	stack[++top]=value;
	}
	int pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
			return -1;
		}
		return stack[top--];
	}
	int peek(){
		if(top==-1){
			System.out.println("Stack Underflow");
			return -1;
		}
		return stack[top];
	}
	void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
	public static void main(String args[]){
		StackArray arr = new StackArray(10);
		arr.push(10);
		arr.push(20);
		arr.push(30);
		arr.push(40);
		arr.push(50);
		arr.push(60);
		arr.push(70);
		arr.push(80);
		arr.push(90);
		arr.push(100);
		System.out.println(arr.pop());
		System.out.println(arr.peek());
		
		
		
		
		
		
	}
}