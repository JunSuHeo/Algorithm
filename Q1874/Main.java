package Q1874;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] visited = new int[n + 1];
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			arr.add(tmp);
		}
		
		StringBuilder sb = new StringBuilder();
		int preTarget = 1;
		
		boolean isAvailable = true;
		
		for(int target : arr) {
			if(preTarget <= target) {
				for(int i = preTarget; i <= target; i++) {
					if(visited[i] == 0) {
						sb.append("+");
					}
				}
				sb.append("-");
				visited[target]++;
			} else {
				int popCnt = 0;
				for(int i = preTarget; i >= target; i--) {
					if(visited[i] != 0) {
					}
					else {
						popCnt++;
						
						if(popCnt > 1) {
							isAvailable = false;
						}
						else {
							sb.append("-");
							visited[i]++;
						}
						
					}
				}
				
			}
			
			preTarget = target;
		}
		
		if(isAvailable) {
			String result = sb.toString();
			for(int i = 0; i < result.length(); i++) {
				System.out.println(result.charAt(i));
			}
		} else {
			System.out.println("NO");
		}
	}

}
