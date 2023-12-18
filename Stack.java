package opps_lect37;

public class Stack {

	private int[] data;
	private int top = 0;

// non-parametroid constructor
	public Stack() {

		this.data = new int[5];// Stack create of 5 size;

	}

// para-metroid constructor
	public Stack(int cap) {
		this.data = new int[cap];

	}

// Stack is Empty
	public boolean isEmpty() {

		return top == 0;

	}

// Stack is full
	public boolean isFull(){
		
		return top == this.data.length;
	}

//	element push in Stack
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception(" Stack  is full You Can't Insert any new element");
			
		}
		this.data[this.top] = item;
		top++;
	}

	// element pop in Stack
	public int pop() {
		this.top--; // top=top-1;
		return this.data[top];

	}

	// to show the element in Stack
	public int peek()throws Exception {
		if(isEmpty()) {
			throw new Exception(" stack is empty we can't access any elements");
		}
		return this.data[top - 1];

	}

	// size of atack
	public int size() {
		return this.top;
	}

	// display the element in Stack
	public void Display() {
		for (int i = 0; i < top; i++) {
			System.out.print(this.data[i]+" ");
		}
		System.out.println();

	}

}
