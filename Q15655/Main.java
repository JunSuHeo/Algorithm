package Q15655;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static int N;
	private static int M;
	private static int[] result;
	private static int[] arr;
	private static int[] visited;
	private static StringBuilder sb = new StringBuilder();
	
	public static void dfs(int idx, int depth) {
		if(depth == M) {
			for(int a : result) {
				sb.append(a).append(' ');
			}
			sb.append('\n');
			
			return ;
		}
		
		for(int i = idx; i < N; i++) {
			if(visited[i] == 0) {
				visited[i] = 1;
				result[depth] = arr[i];
				dfs(i, depth + 1);
				visited[i] = 0;
			}
			
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		result = new int[M];
		visited = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		dfs(0, 0);
		
		System.out.println(sb);
	}

}
