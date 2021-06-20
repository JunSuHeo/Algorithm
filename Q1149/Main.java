package Q1149;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int[][] house = new int[n+1][3];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 3; j++) {
				house[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j < 3; j++) {
				if(j == 0) {
					house[i][j] += Math.min(house[i-1][1], house[i-1][2]);
				} else if(j == 1) {
					house[i][j] += Math.min(house[i-1][0], house[i-1][2]);
				} else if(j == 2) {
					house[i][j] += Math.min(house[i-1][1], house[i-1][0]);
				}
			}
		}
		
		int min = Math.min(house[n][0], house[n][1]);
		min = Math.min(house[n][2], min);
		
		System.out.println(min);
	}

}
