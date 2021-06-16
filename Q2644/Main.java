package Q2644;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	private static ArrayList<Integer>[] arr = new ArrayList[101];
	private static int[] visited = new int[101];
	private static int result = 0;
	
	public static void dfs(int start, int end, int cnt) {
		visited[start] = 1;
		
		if(start == end) {
			result = cnt;
			return;
		}
		
		for(int tmp : arr[start]) {
			if(visited[tmp] == 0) {
				dfs(tmp, end, cnt+1);
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		
		for(int i = 0; i <= n; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for(int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x].add(y);
			arr[y].add(x);
		}
		
		dfs(start, end, 0);
		if(result == 0) System.out.println(-1);
		else System.out.println(result);
	}
}
