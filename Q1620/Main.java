package Q1620;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		HashMap<String, Integer> name = new HashMap<String, Integer>();
		HashMap<Integer, String> num = new HashMap<Integer, String>();
		
		for(int i = 0; i < N; i++) {
			String tmp = br.readLine();
			name.put(tmp, i+1);
			num.put(i+1, tmp);
		}
		
		for(int i = 0; i < M; i++) {
			String command = br.readLine();
			
			if(command.charAt(0) >= 'A' && command.charAt(0) <= 'Z') {
				sb.append(name.get(command)).append('\n');
			} else {
				int tmp = Integer.parseInt(command);
				sb.append(num.get(tmp)).append('\n');
			}
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}

}
