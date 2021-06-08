package Q10866;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		StringBuilder sb = new StringBuilder();
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			
			switch(command) {
			case "push_front":
				int frontNum = Integer.parseInt(st.nextToken());
				dq.offerFirst(frontNum);
				break;
			case "push_back":
				int backNum = Integer.parseInt(st.nextToken());
				dq.offerLast(backNum);
				break;
			case "pop_front":
				if(dq.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(dq.poll()).append('\n');
				}
				break;
			case "pop_back":
				if(dq.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(dq.pollLast()).append('\n');
				}
				break;
			case "size":
				sb.append(dq.size()).append('\n');
				break;
			case "empty":
				if(dq.isEmpty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
				break;
			case "front":
				if(dq.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(dq.peek()).append('\n');
				}
				break;
			case "back":
				if(dq.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(dq.peekLast()).append('\n');
				}
				break;
			}
		}
		
		System.out.println(sb);
	}
}
