package Q2217;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr);
		
		int cnt = 0;
		int max = -1;
		for(int i = arr.size() - 1; i >= 0; i--) {
			int tmp = arr.get(i);
			cnt++;
			
			if(max < cnt * tmp) {
				max = cnt*tmp;
			}
		}
		
		System.out.println(max);
	}
}
