package Q1026;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		List<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		
		List<Integer> b = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			b.add(Integer.parseInt(st.nextToken()));
		}
		
		
		Collections.sort(b, Comparator.reverseOrder());
		Collections.sort(a);
		
		int result = 0;
		for(int i = 0; i < N; i++) {
			result += (a.get(i) * b.get(i));
		}
		
		System.out.println(result);
	} 
}
