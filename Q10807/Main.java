package Q10807;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[91];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i <= 90; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		System.out.println(arr[n]);
	}

}
