package Q1966;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			Queue<Integer> q = new ArrayDeque<Integer>();
			int m = Integer.parseInt(st.nextToken());
			int targetIdx = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < m; j++) {
				q.add(Integer.parseInt(st.nextToken()));
			}
			
			int printCnt = 0;
			
			while(targetIdx != -1) {
				int firstNum = q.peek();
				int maxNum = 0;
				
				for(int j = 9; j > 0; j--) {
					if(q.contains(j)) {
						maxNum = j;
						break;
					}
				}
				
				if(firstNum < maxNum) {		// Do not print
					if(targetIdx == 0) {
						int tmp = q.poll();
						q.add(tmp);
						targetIdx = q.size() - 1;
					} else {
						int tmp = q.poll();
						q.add(tmp);
						targetIdx--;
					}
				} else {	// print
					printCnt++;
					
					q.poll();
					targetIdx--;
				}
				
			}
			
			sb.append(printCnt).append('\n');
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb);
	}
}

