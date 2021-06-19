package Q15663;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	private static int N;
	private static int M;
	private static int[] result;
	private static int[] arr;
	private static StringBuilder sb = new StringBuilder();
	private static Set<String> str = new HashSet<String>();
	
	public static void dfs(int idx, int depth) {
		if(depth == M) {
			sb = new StringBuilder();
			for(int a : result) {
				sb.append(a).append(' ');
			}
			str.add(sb.toString());
			
			return ;
		}
		
		for(int i = 0; i < N; i++) {
				result[depth] = arr[i];
				dfs(i, depth + 1);
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		result = new int[M];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		dfs(0, 0);
		
		sb = new StringBuilder();
		for(String line : str) {
			sb.append(line).append('\n');
		}
		
		System.out.println(sb);
	}

}
