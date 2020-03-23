import java.util.Stack;

public class App {

	public static void main(String[] args) {
		// Stack is LIFO = Last In First Out
		Stack<String> stack = new Stack<String>();

		stack.add("a");
		stack.add("b");
		stack.add("c");

		System.out.println(stack.peek()); // --> c
		System.out.println(stack); // --> [a, b, c]

		String poped = stack.pop();
		System.out.println(poped); // --> c
		System.out.println(stack); // --> [a, b]

		String firstElement = stack.firstElement();
		System.out.println(firstElement); // --> a
		System.out.println(stack); // --> [a, b]

		stack.push("d");
		System.out.println(stack); // --> [a, b, d]

	}

}
