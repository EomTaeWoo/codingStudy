package Programmers.ThirdWeek;

import java.util.*;

public class Chap02_01 {
	
	class Position{
		int x, y;
		
		Position(int x, int y){
			this.x = x;
			this.y = y;
		}
		// 위치이동 가능하게 해주는 확인 처리
		boolean isValid(int width, int height) {
			if(x < 0 || x >= width) return false;
			if(y < 0 || y >= height) return false;
			return true;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[][] maps) {
		// 너비우선 탐색
		// BFS : Queue 사용
		
		int mapHeight = maps.length;
		int mapWidth = maps[0].length;
		// 플레이어가 움직이고 있는 현재 위치 표현
		Queue<Position> queue = new LinkedList<>();
		// 이동 경로 최단 거리를 알기위한 값
		int[][] count = new int[mapHeight][mapWidth];
		
		// 지나온 길인지 아닌지 확인
		boolean[][] visited = new boolean[mapHeight][mapWidth];
		
		// queue의 값을 넣는 것 offer();
		// 플레이어의 초기값 넣기
		queue.offer(new Position(0,0));
		count[0][0] = 1;
		visited[0][0] = true;
		
		while(!queue.isEmpty()) {
			// queue의 값을 꺼내오는 것 poll();
			Position current = queue.poll();
			
			int currentCount = count[current.y][current.x];
			
			// 4가지 경우
			int[][] moving = {{0,-1},{0,1},{-1,0},{1,0}};
			for(int i = 0; i < moving.length; i ++) {
				// 내가 이동하게 될 위치
				Position moved = new Position(current.x + moving[i][0], current.y + moving[i][1]);
				if(!moved.isValid(mapWidth, mapHeight)) {
					continue;
				}
				if(visited[moved.y][moved.x]) continue;
				if(maps[moved.y][moved.x] == 0) continue;	// 0 : 벽 , 1 : 길
				
				// 이동하게될 count값
				count[moved.y][moved.x] = currentCount + 1;
				visited[moved.y][moved.x] = true;
				queue.offer(moved);
				
			}
			
			// 이동하게 된 곳이 이미 지나온 곳이라면
			// 벽이 아닌 경우 : maps[moved.y][moved.x] != 1
			// 맵의 영역 밖으로 벗어나는 경우 : !(moved.x < 0 || moved.x >= mapWidth || moved.y < 0 || moved.y >= mapHeight)
			//if(!visited[moved.y][moved.x] && maps[moved.y][moved.x] != 1 && moved.isValid(mapWidth, mapHeight)) {
			//	// 이동하게될 count값
			//	count[moved.y][moved.x] = currentCount + 1;
			//	queue.offer(moved);
			//}
			
			// 4가지 경우
			// BFS를 푸는 가장 기본적인 방식
			//queue.offer(new Position(current + 1, current));	// 동
			//queue.offer(new Position(current - 1, current));	// 서
			//queue.offer(new Position(current, current + 1));	// 남
			//queue.offer(new Position(current, current - 1));	// 북
		}
		
		// 목적지
		int answer = count[mapHeight - 1][mapWidth - 1];
		// 도달하지 못한 경우
		if(answer == 0) {
			return -1;
		} else {
			return answer;
		}
	}

}
