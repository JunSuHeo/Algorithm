package Q11478;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		HashSet<String> arr = new HashSet<String>();
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j <= str.length(); j++) {
				String tmp = str.substring(i, j);
				
				arr.add(tmp);
			}
		}
		
		System.out.println(arr.size());
	}

}
