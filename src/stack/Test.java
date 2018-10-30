package stack;

public class Test {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
