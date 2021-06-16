package Q2468;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	private static ArrayList<Integer>[] arr = new ArrayList[101];
	public static int maxCnt = 0;
	public static int[] dirX = {1, -1, 0, 0};
	public static int[] dirY = {0, 0, 1, -1};
	public static int[][] visited = new int[101][101];
	public static ArrayList<Integer>[] tmp = new ArrayList[101];
	public static int N;
	
	public static void dfs(int x, int y) {
		visited[x][y] = 1;
		
		for(int i = 0; i < 4; i++) {
			int moveX = x + dirX[i];
			int moveY = y + dirY[i];
			
			if(0 <= moveX && moveX < N && 0 <= moveY && moveY < N) {
				if(tmp[moveX].get(moveY) == 1 && visited[moveX][moveY] == 0) {
					dfs(moveX, moveY);
				}
				
			}
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i] = new ArrayList<Integer>();
			
			for(int j = 0; j < N; j++) {
				arr[i].add(Integer.parseInt(st.nextToken()));
			}
			
		}
		
		for(int i = 1; i <= 100; i++) {
			int cnt = 0;
			
			// 초기화
			for(int j = 0; j < N; j++) {
				tmp[j] = new ArrayList<Integer>();
				for(int k = 0; k < N; k++) {
					if(i <= arr[j].get(k)) {
						tmp[j].add(1);
					} else {
						tmp[j].add(0);
					}
					visited[j][k] = 0;
				}
			}
			
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					if(visited[j][k] == 0 && tmp[j].get(k) == 1) {
						dfs(j, k);
						cnt++;
					}
				}
			}
			
			if(cnt > maxCnt) maxCnt = cnt;
			
			
		}
		
		System.out.println(maxCnt);
	}

}
