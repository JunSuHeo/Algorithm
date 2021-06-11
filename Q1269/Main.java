package Q1269;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int aCnt = Integer.parseInt(st.nextToken());
		int bCnt = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		HashSet<Integer> arr = new HashSet<Integer>();
		
		int cnt = 0;
		int bAddCnt = 0;
		 
		for(int i = 0; i < aCnt; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			arr.add(tmp);
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < bCnt; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			if(!arr.add(tmp)) {
				bAddCnt++;
			}
		}
		
		cnt = (aCnt - bAddCnt) + (bCnt - bAddCnt);
		
		System.out.println(cnt);
	}

}
