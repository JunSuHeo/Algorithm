package Q2346;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static class Pair{
		private int idx;
		private int card;
		
		public Pair(int idx, int card) {
			this.idx = idx;
			this.card = card;
		}
		
		public int getIdx() {
			return idx;
		}
		public int getCard() {
			return card;
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Deque<Pair> dq = new ArrayDeque<Pair>();
		
		for(int i = 0; i < n; i++) {
			dq.offer(new Pair(i + 1, Integer.parseInt(st.nextToken())));
		}
		
		StringBuilder sb = new StringBuilder();
		Pair tmp = dq.pollFirst();
		sb.append(tmp.getIdx()).append(' ');
		
		while(!dq.isEmpty()) {
			int num = tmp.getCard();
			if(num > 0 && !dq.isEmpty()) {
				if(num == 1) {
//					Pair a = dq.pollFirst();
//					dq.offerLast(a);
				} else {
					for(int i = 0; i < num - 1; i++) {
						Pair a = dq.pollFirst();
						dq.offerLast(a);
					}
				}
				
				tmp = dq.pollFirst();
			} else if(num < 0 && !dq.isEmpty()) {
				num *= -1;
				if(num == 1) {
//					Pair a = dq.pollLast();
//					dq.offerFirst(a);
				} else {
					for(int i = 0; i < num - 1; i++) {
						Pair a = dq.pollLast();
						dq.offerFirst(a);
					}
				}
				
				tmp = dq.pollLast();
			}
			
			
			sb.append(tmp.getIdx()).append(' ');
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb);
	}

}
