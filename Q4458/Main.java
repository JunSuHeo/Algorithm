package Q4458;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			String upper = s.substring(0, 1).toUpperCase() + s.substring(1);
			arr[i] = upper;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
