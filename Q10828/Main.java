package Q10828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			arr.add(str);
		}
		
		Stack<Integer> stc = new Stack<Integer>();
		
		for(String str : arr) {
			StringTokenizer st = new StringTokenizer(str);
			String command = st.nextToken();
			
			switch(command) {
			case "push":
				int a = Integer.parseInt(st.nextToken());
				
				stc.push(a);
				break;
			case "pop":
				if(stc.empty()) {
					System.out.println("-1");
				} else {
					System.out.println(stc.pop());
				}
				break;
			case "size":
				System.out.println(stc.size());
				break;
			case "empty":
				if(stc.empty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;
			case "top":
				if(stc.empty()) {
					System.out.println("-1");
				} else {
					System.out.println(stc.lastElement());
				}
				break;
			}
		}
	}
}
