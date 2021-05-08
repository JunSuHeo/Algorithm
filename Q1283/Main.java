package Q1283;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static int[] alpha = new int[26];
	
	public static class Pair{
		String key;
		int value;

		public Pair(String key, int value) {
			this.key = key;
			this.value = value;
		}
		
		public void printPair() {
			StringBuilder sb = new StringBuilder();
			
			if(value == -1) {
				System.out.println(key);
			} else if(value == 0) {
				sb.append("[" + key.charAt(0) + "]" + key.substring(1));
				System.out.println(sb.toString());
			} else {
				sb.append(key.substring(0, value) + "[" + key.charAt(value) + "]" + key.substring(value + 1));
				System.out.println(sb.toString());
			}
			
			
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Pair> arr = new ArrayList<Pair>();
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			String tmp = " " + str;
			int value = -1;
			boolean find = false;
			
			for(int j = 1; j < tmp.length(); j++) {			
				if(tmp.charAt(j - 1) == ' ') {				// 단어의 시작이라면
					int idx = getAlpha(tmp.charAt(j));
					if(idx != -1 && alpha[idx] == 0) {	// 단축키 지정이 안되어있다면
						alpha[idx] = 1;
						value = j - 1;
						find = true;
						break;
					}
				}
			}
			
			if(find) {
				arr.add(new Pair(str, value));
			} else {
				value = -1;
				for(int j = 0; j < str.length(); j++) {
					if(str.charAt(j) != ' ') {		// 소문자들만 확
						int idx = getAlpha(str.charAt(j));
						
						if(alpha[idx] == 0) {	// 단축키 지정이 안되어있다면
							alpha[idx] = 1;
							value = j;
							break;
						}
					}
				}
				
				arr.add(new Pair(str, value));
			}
			
			
		}
		
		for(Pair a : arr) {
			a.printPair();
		}
	}
	
	public static int getAlpha(char a) {
		if(a >= 'A' && a <= 'Z') {
			int idx = (int) a - 'A';
			return idx;
		} else if(a >= 'a' && a <= 'z') {
			int idx = (int) a - 'a';
			return idx;
		}
		return -1;
	}
}