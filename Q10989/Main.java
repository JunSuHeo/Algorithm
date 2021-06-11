package Q10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int [] arr = new int[10001];
		
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[a]++;
		}
		
		for(int i = 1; i < 10001; i++) {
			if(arr[i] > 0) {
				while(arr[i] != 0) {
					bw.write(i + "\n");
					arr[i]--;
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
