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
			int target = Integer.parseInt(st.nextToken());
			
			Deque<Integer> dq = new ArrayDeque<Integer>();
			int maxTarget = 0;
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < printCnt; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				
				if(tmp > maxTarget) {
					maxTarget = tmp;
				} else {
					
				}
			}
		}
	}
}
