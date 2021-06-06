package Q10799;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
	public static ArrayList<Integer> razer;
	
	public static class Pair{
		int start;
		int end;
		
		public Pair(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		public int getRazerLoc() {
			int cnt = 0;
			
			for(int x : razer) {
				if(x >= start && x <= end) {
					cnt++;
				}
			}
			
			return cnt;
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		Stack<Integer> openStack = new Stack<Integer>();
		ArrayList<Pair> stick = new ArrayList<Pair>();
		razer = new ArrayList<Integer>();
		
		
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case '(':
				openStack.push(i);
				break;
			case ')':
				int tmp = openStack.pop();
				
				if(i - tmp == 1) {		// 레이저
					razer.add(i);
				} else {				// 막대기
					stick.add(new Pair(tmp, i));
				}
				
				break;
			}
		}
		
		int cnt = 0;
		for(Pair tmp : stick) {
			cnt += tmp.getRazerLoc();
		}
		cnt += stick.size();
		
		System.out.println(cnt);
		
	}

}
