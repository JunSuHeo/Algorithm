package Q10816;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Main {
	private static int[] count = new int[20000001];

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken()) + 10000000;
			count[tmp]++;
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		List<Integer> target = new ArrayList<Integer>();
		for(int i = 0; i < M; i++) {
			target.add(Integer.parseInt(st.nextToken()));
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : target) {
			a += 10000000;
			sb.append(count[a]).append(' ');
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb);
	}

}
