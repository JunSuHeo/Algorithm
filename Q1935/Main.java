package Q1935;

import java.io.InputStreamReader;
import java.util.Stack;
import java.io.BufferedReader;

public class Main {
	public static Stack<Double> result = new Stack<Double>();
	public static double[] alpha;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		alpha = new double[n];
		
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			alpha[i] = tmp;
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {	// 알파벳일 경우
				int idx = (int) str.charAt(i) - 'A';
				result.push(alpha[idx]);
			} else {		//연산자일 경우
				calc(str.charAt(i));
			}
		}
		
		double tmp = result.pop();
		
		System.out.println(String.format("%.2f", tmp));
		
	}
	
	public static void calc(char expr) {
		double left = 0;
		double right = 0;
		
		switch(expr) {
		case '+':
			left = result.pop();
		
			right = result.pop();
			
			result.push(left + right);
			break;
		case '-':
			left = result.pop();
		
			right = result.pop();
			
			result.push(right - left);
			break;
		case '*':
			left = result.pop();
		
			right = result.pop();
			
			result.push(right * left);
			break;
		case '/':
			left = result.pop();
		
			right = result.pop();
			
			result.push(right / left);
			break;
		}
	}

}
