package study;

import java.util.*;

public class Baek_2178 {

	static int n, m;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int[][]map;
	static boolean[][] visited;
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		map = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0;i<n;i++) {
			String s = scan.next(); //붙어서 입력되기 때문에 다음공백까지 받아오는 scan.next를 사용 
			for(int j=0;j<m;j++) {
				map[i][j] = s.charAt(j) - '0'; //아스키코드 변환 
			}
		}
		
		bfs();
		System.out.print(map[n-1][m-1]);	//(n,m) 출력. 좌표값이기 때문에 -1 	
	
		
	}
	
	public static void bfs() {
		Queue<Integer> queX = new LinkedList<Integer>(); //x값에 대한 queue
		Queue<Integer> queY = new LinkedList<Integer>(); //y값에 대한 queue
		
		queX.add(0); //저
		queY.add(0);
		
		visited[0][0] = true;
		
		while(!queX.isEmpty()) {
			int x = queX.poll();
			int y = queY.poll();
			
			for(int i = 0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				//유효한범위인지 확
				if(nx>=0 && ny>=0 && nx<n && ny<m) {
					if(map[nx][ny] == 1 & !visited[nx][ny]) {
						queX.add(nx);
						queY.add(ny);
						
						visited[nx][ny] = true;
						map[nx][ny] = map[x][y] + 1;
					}
				}
			}
			
		}
		
	}

}
