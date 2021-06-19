package Q15651;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Main {
	private static int N;
	private static int M;
	private static int[] arr = null;
	private static StringBuilder sb = new StringBuilder();
	
	private static void dfs(int depth) {
		if(depth == M) {
			for(int a : arr) {
				sb.append(a).append(' ');
			}
			sb.append('\n');
			
			return ;
		}
		
		for(int i = 0; i < N; i++) {
			arr[depth] = i + 1;
			dfs(depth + 1);
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		dfs(0);
		
		System.out.println(sb);
	}

}
