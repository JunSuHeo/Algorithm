package Q3613;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int flag = 0;		// 0 : Error, 1 : java, 2 : C++
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length() - 1);
		
		if(firstChar >= 'a' && firstChar <= 'z') {
			int javaCnt = 0;
			int cCnt = 0;
			
			for(int i = 1; i < str.length(); i++) {
				if(str.charAt(i) == '_') {
					if(i != str.length() - 1 && (str.charAt(i + 1) >= 'a' && str.charAt(i + 1) <= 'z')) {
						cCnt++;
					} else {
						cCnt = -1;
						javaCnt = -1;
						break;
					}
				} else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					javaCnt++;
				}
			}
			
			if(javaCnt == 0 && cCnt == 0) {	// 둘 다 없으면?
				flag = 3;
			} else if(javaCnt > 0 && cCnt == 0) {	// java case
				flag = 1;
			} else if(cCnt > 0 && javaCnt == 0) {	// c++ case
				flag = 2;
			} else {								// error case
				flag = 0;
			}
			
		}
		
		switch(flag) {
		case 0:
			System.out.println("Error!");
			break;
		case 1:
			javaToC(str);
			break;
		case 2:
			cToJava(str);
			break;
		case 3:
			System.out.println(str);
			break;
		}
	}
	
	public static void javaToC(String str) {
		Pattern pattern = Pattern.compile("([A-Z])");
		Matcher matcher = pattern.matcher(str);
		Matcher nextMatcher = pattern.matcher(str);
		
		String result = "";
		
		if(nextMatcher.find()) {
			result = str.substring(0, nextMatcher.start());
		}
		while(matcher.find()) {
			if(nextMatcher.find()) {
				result += "_" + matcher.group().toLowerCase();
				result += str.substring(matcher.start() + 1, nextMatcher.start());
			} else {
				result += "_" + matcher.group().toLowerCase();
				result += str.substring(matcher.start() + 1, str.length());
			}
			
		}
		
		System.out.println(result);
	}
	
	public static void cToJava(String str) {
		StringTokenizer st = new StringTokenizer(str, "_");
		
		String result = "";
		
		result += st.nextToken();
		
		while(st.hasMoreTokens()) {
			String tmp = st.nextToken();
			result += tmp.substring(0, 1).toUpperCase() + tmp.substring(1);
		}
		
		System.out.println(result);
	}
}




/*
	java : 첫 단어는 소문자, 다음 단어부터는 첫문자만 대문자로 사용	1
	c++  : 변수명에 소문자만 사용, 단어를 구분하기 위해 _ 사용		2
	둘다아님: 첫단어가 대문자, _와 대문자가 섞여있는 경우			0
*/