package Q1918;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String expr = br.readLine();
		
		String result = "";
		Stack<Character> s = new Stack<Character>();
		
		for(int i = 0; i < expr.length(); i++) {
			char tmp = expr.charAt(i);
			if(tmp >= 'A' && tmp <= 'Z') {
				result += tmp;
			}
			
			switch(tmp) {
			case '+':
			case '-' :
				while(!s.empty() && s.peek() != '(') {
					result += s.peek();
					s.pop();
				}
				s.push(tmp);
				break;
			case '*' :
			case '/' :
				while(!s.empty() && (s.peek() == '*' || s.peek() == '/')) {
					result += s.peek();
					s.pop();
				}
				s.push(tmp);
				break;
			case '(' :
				s.push(tmp);
				break;
			case ')' :
				while(!s.empty() && s.peek() != '(') {
					result += s.peek();
					s.pop();
				}
				s.pop();
				break;
			}
		}
		
		while(!s.empty()) {
			result += s.peek();
			s.pop();
		}
		
		System.out.println(result);
	}

}
