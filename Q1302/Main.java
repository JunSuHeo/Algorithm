package Q1302;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> arr = new HashMap<String, Integer>();
		int max = 0;
		for(int i = 0; i < N; i++) {
			String title = br.readLine();
			
			if(arr.containsKey(title)) {
				int tmp = arr.get(title);
				arr.replace(title, ++tmp);
				
				if(max < tmp) {
					max = tmp;
				}
			} else {
				arr.put(title, 1);
				
				if(max < 1) {
					max = 1;
				}
			}
		}
		
		List<String> list = new ArrayList<String>(arr.keySet());
		Collections.sort(list);
		
		for(String tmp : list) {
			if(arr.get(tmp) == max) {
				System.out.println(tmp);
				break;
			}
		}
		
	}

}
