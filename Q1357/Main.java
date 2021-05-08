package Q1357;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		int result = rev(Integer.toString(rev(a) + rev(b)));
		
		System.out.println(result);
	}
	
	public static int rev(String a) {
		int rtv = 0;
		
		StringBuffer sb = new StringBuffer(a);
		rtv = Integer.parseInt(sb.reverse().toString());
		
		return rtv;
	}
}
