package Q15654;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static int N;
	private static int M;
	private static int[] arr;
	private static StringBuilder sb = new StringBuilder();
	private static int[] arr2;
	private static int[] visited;
	
	public static void dfs(int depth) {
		if(depth == M) {
			for(int a : arr) {
				sb.append(a).append(' ');
			}
			sb.append('\n');
			
			return ;
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i] == 0) {
				visited[i] = 1;
				arr[depth] = arr2[i];
				dfs(depth + 1);
				visited[i] = 0;
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		arr2 = new int[N];
		visited = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr2);
		dfs(0);
		
		System.out.println(sb);
		
	}
}
