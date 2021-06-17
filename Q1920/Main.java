package Q1920;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		int M = Integer.parseInt(br.readLine());
		ArrayList<Integer> target = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < M; i++) {
			target.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arr);

		for(int a : target) {
			if(Collections.binarySearch(arr, a) >= 0) {
				sb.append(1).append('\n');
			} else {
				sb.append(0).append('\n');
			}
		}
		
		System.out.println(sb);
	}

}
