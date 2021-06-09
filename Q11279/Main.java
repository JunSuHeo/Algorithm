package Q11279;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(br.readLine());
			
			if(tmp == 0) {
				if(pq.isEmpty()) {
					sb.append(0).append('\n');
				} else {
					sb.append(pq.poll()).append('\n');
				}
			} else {
				pq.offer(tmp);
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}
}
