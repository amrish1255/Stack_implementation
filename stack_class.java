package opps_lect37;

public class stack_class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Stack s = new Stack();
//		Stack<Integer> s = new Stack<>();
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		s.push(40);
//		s.push(50);
//		s.push(60);
//		s.push(70);
		System.out.println(s.pop());
		
		s.Display();
		System.out.println(s.peek());// top element peek
		System.out.println(s.size());

	}

}
