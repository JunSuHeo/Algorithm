package Q5430;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String command = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String arr = br.readLine();
			arr = arr.substring(1, arr.length() - 1);
			
			Deque<Integer> dq = new ArrayDeque<Integer>();
			StringTokenizer st = new StringTokenizer(arr, ",");
			
			for(int j = 0; j < n; j++) {
				dq.offer(Integer.parseInt(st.nextToken()));
			}
			
			boolean flag = false;
			boolean check = false;
			
			for(int j = 0; j < command.length(); j++) {
				if(command.charAt(j) == 'R') {
					if(flag) {
						flag = false;
					} else {
						flag = true;
					}
				} else if(command.charAt(j) == 'D') {
					if(dq.isEmpty()) {
						check = true;
						break;
					} else {
						if(flag) {
							dq.pollLast();
						} else {
							dq.pollFirst();
						}
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			if(check) {
				sb.append("error");
			} else {
				sb.append('[');
				if(flag) {
					while(!dq.isEmpty()) {
						sb.append(dq.pollLast()).append(',');
					}
				} else {
					while(!dq.isEmpty()) {
						sb.append(dq.poll()).append(',');
					}
				}
				if(sb.length() != 1) {
					sb.deleteCharAt(sb.length() - 1);
				}
				
				sb.append(']');
			}
			System.out.println(sb);
			
		}
	}

}
