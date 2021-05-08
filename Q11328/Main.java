package Q11328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static ArrayList<Pair> arr = new ArrayList<Pair>();
	
	static class Pair{
		String a, b;
		Pair(String a, String b){
			this.a = a;
			this.b = b;
		}
		
		public boolean checkAB() {
			int[] a_arr = new int[26];
			int[] b_arr = new int[26];
			
			for(int i = 0; i < a.length(); i++) {
				a_arr[(int)a.charAt(i) - 97]++;
			}
			
			for(int i = 0; i < b.length(); i++) {
				b_arr[(int)b.charAt(i) - 97]++;
			}
			
			for(int i = 0; i < 26; i++) {
				if(a_arr[i] != b_arr[i]) {
					return false;
				}
			}
			
			return true;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		
		int n = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine().trim());
			
			String a = st.nextToken();
			String b = st.nextToken();
			
			arr.add(new Pair(a, b));
			
		}
		
		for(int i = 0; i < n; i++) {
			if(arr.get(i).checkAB()) {
				System.out.println("Possible");
			}else {
				System.out.println("Impossible");
			}
		}
		
	}

}