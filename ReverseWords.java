import java.util.*;

class ReverseWords {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		System.out.println("Enter text");
		while (!Console.EndOfFile()) 
			stack.push(Console.readToken()); // assume enough room
		while(!stack.isEmpty()) {
			String s = stack.pop();
			System.out.print(s + " ");
		}
	}
}
