package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test12 {
	static int[][] arr;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); // 정점의 개수
		int m = scan.nextInt(); //간선의 개
		int v = scan.nextInt(); // 탐색을 시작할 번호
		
		//인접행렬 생성
		arr = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}

		visited = new boolean[n + 1];
		dfs(v);
	}

	//깊이우선탐색(재귀)
	public static void dfs(int v) {
		visited[v] = true;
		System.out.print(v + " ");

		if (v == arr.length) {
			return;
		}
		for (int j = 1; j < arr.length; j++) {
			//연결은 되어있는데, 방문하지 않았다면 재
			if (arr[v][j] == 1 && visited[j] == false) {
				dfs(j);
			}
		}

	}
	
	//너비우선탐색(큐)
	public static void bfs(int v) {
		Queue<Integer> que = new LinkedList<Integer>();

		que.add(v);
		visited[v] = true;
		System.out.print(v + " ");

		while (!que.isEmpty()) {
			int temp = que.poll();
			for (int i = 1; i < arr.length; i++) {
				if (arr[temp][i] == 1 && visited[i] == false) {
					que.add(i);
					visited[i] = true;
					System.out.print(i + " ");
				}
			}
		}

	}

}
