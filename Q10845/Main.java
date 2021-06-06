package Q10845;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		int rear = 0;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String operator = st.nextToken();
			switch(operator) {
			case "push":
				int tmp = Integer.parseInt(st.nextToken());
				q.add(tmp);
				rear = tmp;
				break;
			case "pop":
				if(q.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(q.remove());
				}
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if(q.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;
			case "front":
				if(q.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(q.peek());
				}
				break;
			case "back":
				if(q.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(rear);
				}
				break;
			}
		}
	}
}