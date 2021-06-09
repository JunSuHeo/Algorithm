package Q5397;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

		Stack<String> left = new Stack<String>();
		Stack<String> right = new Stack<String>();
		
		for(int i = 0; i < N; i++) {
			
			String text = br.readLine();
			
			for(int j = 0; j < text.length(); j++) {
				char c = text.charAt(j);
				
				switch(c) {
				case '<':
					if(!left.isEmpty())
						right.push(left.pop());

					break;
				case '>':
					if(!right.isEmpty())
						left.push(right.pop());

					break;
				case '-':
					if(!left.isEmpty()) {
						left.pop();
					}
					break;
				default:
					char t = text.charAt(j);
					left.push(String.valueOf(t));
					break;
				}
			}
			
			while(!left.isEmpty())
				right.push(left.pop());
			
			while(!right.isEmpty())
				bw.write(right.pop());
			bw.write('\n');
			bw.flush();
			
		}
		
		bw.close(); 
	}

}
