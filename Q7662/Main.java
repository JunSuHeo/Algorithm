package Q7662;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for(int j = 0; j < M; j++) {
				String str = br.readLine();
				StringTokenizer st = new StringTokenizer(str, " ");
				char c = st.nextToken().charAt(0);
				int data = Integer.parseInt(st.nextToken());
				
				if(c == 'I') {
					map.put(data, map.getOrDefault(data, 0) + 1);
				} else if(c == 'D') {
					if(map.isEmpty()) continue;
					else {
						if(data == 1) {
							int key = map.lastKey();
							if(map.get(key) == 1) {
								map.pollLastEntry();
							} else {
								map.replace(key, map.get(key) - 1);
							}
						} else if(data == -1) {
							int key = map.firstKey();
							if(map.get(key) == 1) {
								map.pollFirstEntry();
							} else {
								map.replace(key, map.get(key) - 1);
							}
						}
					}
				}
			}
			
			if(map.isEmpty()) {
				sb.append("EMPTY").append('\n');
			} else {
				sb.append(map.lastKey()).append(' ').append(map.firstKey()).append('\n');
			}
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb);
	}

}
