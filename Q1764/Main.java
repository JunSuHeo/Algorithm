package Q1764;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> dontHeard = new HashSet<String>();
		HashSet<String> dontSeeHeard = new HashSet<String>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			dontHeard.add(br.readLine());
		}
		
		for(int i = 0; i < M; i++) {
			String tmp = br.readLine();
			if(!dontHeard.add(tmp)) {
				dontSeeHeard.add(tmp);
			}
		}
		
		List<String> arr = new ArrayList<String>(dontSeeHeard);
		Collections.sort(arr);
		
		sb.append(arr.size()).append('\n');
		for(int i = 0; i < arr.size(); i++) {
			sb.append(arr.get(i)).append('\n');
		}
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb);
	}

}
