package Q1181;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static class MyComparator implements Comparator<String>{

		@Override
		public int compare(String arg0, String arg1) {
			if(arg0.length() > arg1.length()) {
				return 1;
			} else if(arg0.length() == arg1.length()) {
				return arg0.compareTo(arg1);
			}
			return -1;
		}
		
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Set<String> arr = new HashSet<String>();
		
		for(int i = 0; i < N; i++) {
			arr.add(br.readLine());
		}
		
		List<String> tmp = new ArrayList<String>(arr);
		
		Collections.sort(tmp, new MyComparator());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < tmp.size(); i++) {
			sb.append(tmp.get(i)).append('\n');
		}
		
		System.out.println(sb);
	}

}
