package Q1966;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int printCnt = Integer.parseInt(st.nextToken());
			int targetIdx = Integer.parseInt(st.nextToken());
			
			Deque<Integer> dq = new ArrayDeque<Integer>();
			
			st = new StringTokenizer(br.readLine(), " ");
			int maxNum = 0;

			// input queue
			for(int j = 0; j < printCnt; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				dq.offer(tmp);
				
				if(tmp > maxNum) {
					maxNum = tmp;
				}
			}
			
			int idx = 0;
			int count = 0;
			
			while(targetIdx != -1) {
				int tmp = dq.poll();
				
				if(tmp == maxNum) {
					if(dq.contains(tmp)) {
						
					} else {
						for(int j = tmp - 1; j > 0; j--) {
							if(dq.contains(j)) {
								maxNum = j;
								break;
							}
						}
					}
					
					
				}
				
			}
			
		}
	}
}

