package Q11650;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static class Point{
		private int x;
		private int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
	}
	
	public static class MyComparator implements Comparator<Point>{
		@Override
		public int compare(Point o1, Point o2) {
			if(o1.getX() > o2.getX()) {
				return 1;
			} else if(o1.getX() == o2.getX()) {
				if(o1.getY() > o2.getY()) {
					return 1;
				}
			}
			return -1;
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = null;
		List<Point> arr = new ArrayList<Point>();
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr.add(new Point(x, y));
		}
		
		Collections.sort(arr, new MyComparator());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			sb.append(arr.get(i).getX()).append(' ').append(arr.get(i).getY()).append('\n');
		}
		
		System.out.println(sb);
	}

}
