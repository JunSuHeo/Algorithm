package Q7562;

import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Main {
	private static int[] moveX = {1, 2, 2, 1, -1, -2, -2, -1};
	private static int[] moveY = {2, 1, -1, -2, -2, -1, 1, 2};
	private static int[][] visited = new int[301][301];
	private static int[][] chess;
	private static int cnt = 0;
	private static int l;
	
	public static class Pair{
		private int x;
		private int y;
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public void setX(int x) {
			this.x = x;
		}
		public void setY(int y) {
			this.y = y;
		}
	}
	
	public static void bfs(int x, int y, int targetX, int targetY) {
		if(x == targetX && y == targetY) {
			return ;
		}
		visited[x][y] = 1;
		
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(x, y));
		
		while(!q.isEmpty()) {
			Pair tmp = q.poll();
			
			for(int i = 0; i < 8; i++) {
				int newX = tmp.getX() + moveX[i];
				int newY = tmp.getY() + moveY[i];
				
				if(0 <= newX && newX < l && 0 <= newY && newY < l && visited[newX][newY] == 0) {
					q.add(new Pair(newX, newY));
					visited[newX][newY] = 1;
					chess[newX][newY] = chess[tmp.getX()][tmp.getY()] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			l = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			int targetX = Integer.parseInt(st.nextToken());
			int targetY = Integer.parseInt(st.nextToken());
			
			cnt = 0;
			chess = new int[l][l];
			visited = new int[l][l];
			bfs(x, y, targetX, targetY);
			sb.append(chess[targetX][targetY]).append('\n');
		}
		
		System.out.println(sb);
	}
}
