package Q1919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		int cnt = 0;
		
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
				cnt += (a_arr[i] > b_arr[i] ? a_arr[i] - b_arr[i] : b_arr[i] - a_arr[i]);
			}
		}
		
		System.out.println(cnt);
	}
}
