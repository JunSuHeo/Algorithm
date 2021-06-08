package Q1158;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		for(int i = 1; i <= n; i++) {
			dq.offer(i);
		}
		sb.append('<');
		
		while(!dq.isEmpty()) {
			for(int i = 1; i <= k - 1; i++) {
				int tmp = dq.poll();
				dq.offer(tmp);
			}
			sb.append(dq.poll());
			if(!dq.isEmpty()) {
				sb.append(", ");
			}
		}
		
		sb.append('>');
		
		System.out.println(sb);
	}

}
