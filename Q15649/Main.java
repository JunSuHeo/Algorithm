package Q15649;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int[] arr;
	private static int[] visited;
	private static StringBuilder sb = new StringBuilder();
	private static int N;
	private static int M;
	
	public static void dfs(int depth) {
		if(depth == M) {
			for(int tmp : arr) {
				sb.append(tmp).append(' '); 
			}
			sb.append('\n');
			return ;
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i] == 0) {
				visited[i] = 1;
				arr[depth] = i + 1;
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
		visited = new int[N];
		
		dfs(0);
		
		System.out.println(sb);
	}

}
