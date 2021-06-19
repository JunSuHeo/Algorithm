package Q10026;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	private static int[][] visited;
	private static int[][] map;
	private static int[][] visited2;
	private static int[][] map2;
	private static int cnt = 0;
	private static int cnt2 = 0;
	private static int[] moveX = {0, 0, -1, 1};
	private static int[] moveY = {1, -1, 0, 0};
	private static int N;
	
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
	}
	
	public static void bfs(int x, int y, int color, int color2) {
		// 적록색약이 아닌 경우 (모든 색 제대로 판별)
		visited[x][y] = 1;
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(x, y));
		
		while(!q.isEmpty()) {
			Pair tmp = q.poll();
			
			for(int i = 0; i < 4; i++) {
				int newX = tmp.getX() + moveX[i];
				int newY = tmp.getY() + moveY[i];
				
				if(0 <= newX && newX < N && 0 <= newY && newY < N && visited[newX][newY] == 0 && color == map[newX][newY]) {
					q.add(new Pair(newX, newY));
					visited[newX][newY] = 1;
				}
			}
		}
		
		// 적록색약인 경우
		visited2[x][y] = 1;
		Queue<Pair> q2 = new LinkedList<Pair>();
		q2.add(new Pair(x, y));
		
		while(!q2.isEmpty()) {
			Pair tmp = q2.poll();
			
			for(int i = 0; i < 4; i++) {
				int newX = tmp.getX() + moveX[i];
				int newY = tmp.getY() + moveY[i];
				
				if(0 <= newX && newX < N && 0 <= newY && newY < N && visited2[newX][newY] == 0 && color2 == map2[newX][newY]) {
					q2.add(new Pair(newX, newY));
					visited2[newX][newY] = 1;
				}
			}
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		visited = new int[N][N];
		map = new int[N][N];
		visited2 = new int[N][N];
		map2 = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			String line = br.readLine();
			
			for(int j = 0; j < line.length(); j++) {
				if(line.charAt(j) == 'R') {
					map[i][j] = 1;
					map2[i][j] = 1;
				} else if(line.charAt(j) == 'G') {
					map[i][j] = 2;
					map2[i][j] = 1;
				} else if(line.charAt(j) == 'B') {
					map[i][j] = 3;
					map2[i][j] = 3;
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(visited[i][j] == 0) {
					cnt++;
				}
				if(visited2[i][j] == 0) {
					cnt2++;
				}
				bfs(i, j, map[i][j], map2[i][j]);
			}
		}
		
		System.out.println(cnt + " " + cnt2);
	}

}
