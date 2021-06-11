package Q2750;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		List<Short> arr = new ArrayList<Short>();
		
		for(int i = 0; i < N; i++) {
			arr.add(Short.parseShort(br.readLine()));
		}
		Collections.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(arr.get(i)).append('\n');
		}
		System.out.println(sb);
	}

}
