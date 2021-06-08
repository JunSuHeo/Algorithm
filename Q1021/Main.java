package Q1021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		ArrayList<Integer> pick = new ArrayList<Integer>();
		int result = 0;
		
		for(int i = 1; i <= n; i++) {
			dq.offer(i);
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < m; i++) {
			pick.add(Integer.parseInt(st.nextToken()));
		}

		for(int i = 0; i < pick.size(); i++) {
			Deque<Integer> leftDq = new ArrayDeque<Integer>();
			Deque<Integer> rightDq = new ArrayDeque<Integer>();

			while(!dq.isEmpty()) {
				int tmp = dq.poll();
				leftDq.offer(tmp);
				rightDq.offer(tmp);
			}
			int target = pick.get(i);
			
			int leftCnt = 0;
			int rightCnt = 0;
			
			// move left to right
			while(target != leftDq.peekFirst()) {
				int tmp = leftDq.pollFirst();
				leftDq.offerLast(tmp);
				leftCnt++;
			}
			leftDq.poll();
			
			//move right to left
			while(target != rightDq.peekFirst()) {
				int tmp = rightDq.pollLast();
				rightDq.offerFirst(tmp);
				rightCnt++;
			}
			rightDq.poll();
			
			if(leftCnt > rightCnt) {
				while(!rightDq.isEmpty()) {
					int tmp = rightDq.poll();
					dq.offer(tmp);
				}
				result += rightCnt;
			} else {
				while(!leftDq.isEmpty()) {
					int tmp = leftDq.poll();
					dq.offer(tmp);
				}
				result += leftCnt;
			}
		}
		
		System.out.println(result);
	}

}