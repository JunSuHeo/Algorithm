package Q4949;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> arr = new ArrayList<String>();
		
		while(true) {			// 입력받기
			String tmp = br.readLine();
			
			if(tmp.equals(".")) {
				break;
			} else {
				arr.add(tmp);
			}
		}
		
		for(String str : arr) {
			Stack<Character> stc = new Stack<Character>();
			
			for(int i = 0; i < str.length(); i++) {
				switch(str.charAt(i)) {
				case '[':
					stc.push('[');
					break;
				case ']':
					stc.push(']');
					break;
				case '(':
					stc.push('(');
					break;
				case ')':
					stc.push(')');
					break;
				}
			}
			
			int smallCnt = 0;
			int bigCnt = 0;
			Stack<Integer> flag = new Stack<Integer>();		// small = 1, big = 2
			boolean isAvailable = true;
			
			while(!stc.empty() && isAvailable) {
				char tmp = stc.pop();
				int flg = 0;
				
				switch(tmp) {
				case '[':
					bigCnt++;
					if(!flag.empty()) {
						flg = flag.pop();
						if(flg != 2) {
							isAvailable = false;
						}
					} else {
						isAvailable = false;
					}
					break;
				case ']':
					bigCnt--;
					flag.push(2);
					break;
				case '(':
					smallCnt++;
					if(!flag.empty()) {
						flg = flag.pop();
						if(flg != 1) {
							isAvailable = true;
						}
					} else {
						isAvailable = false;
					}
					break;
				case ')':
					smallCnt--;
					flag.push(1);
					break;
				}
			}
			
			if(isAvailable && smallCnt == 0 && bigCnt == 0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
		}
		
	}

}
