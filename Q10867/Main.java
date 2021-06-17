package Q10867;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Set<Integer> arr = new HashSet<Integer>();
		for(int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		List<Integer> tmp = new ArrayList<Integer>(arr);
		
		Collections.sort(tmp);
		
		StringBuilder sb = new StringBuilder();
		for(int a : tmp) {
			sb.append(a).append(' ');
		}
		
		System.out.println(sb);
	}

}
