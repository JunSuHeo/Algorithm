package Q18258;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String operator = st.nextToken();
			switch(operator) {
			case "push":
				dq.offer(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				Integer item = dq.poll();
				if(item == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(item).append('\n');
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
				Integer frontItem = dq.peek();
				if(frontItem == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(frontItem).append('\n');
				}
				break;
			case "back":
				Integer backItem = dq.peekLast();
				if(backItem == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(backItem).append('\n');
				}
				break;
			}
		}
		
		System.out.println(sb);
	}
}