package Q11286;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) ->{
			int abs1 = Math.abs(a);
			int abs2 = Math.abs(b);
			
			if(abs1 == abs2) return (a < b ? -1 : 1);
			else return (abs1 < abs2 ? -1 : 1);
		});
		
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
