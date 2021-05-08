package Q9012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0; i < n; i++) {
			arr.add(br.readLine());
		}
		
		for(String str : arr) {
			int open = 0;
			int close = 0;
			
			boolean isAvailable = true;
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '(') {
					open++;
				} else if(str.charAt(i) == ')') {
					close++;
					if(close > open) {
						isAvailable = false;
						break;
					}
				}
			}
			
			if(isAvailable && open == close) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
