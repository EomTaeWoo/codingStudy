package Programmers.ThirdWeek;

import java.util.*;

public class Chap02_01 {
	
	class Position{
		int x, y;
		
		Position(int x, int y){
			this.x = x;
			this.y = y;
		}
		// ��ġ�̵� �����ϰ� ���ִ� Ȯ�� ó��
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
		// �ʺ�켱 Ž��
		// BFS : Queue ���
		
		int mapHeight = maps.length;
		int mapWidth = maps[0].length;
		// �÷��̾ �����̰� �ִ� ���� ��ġ ǥ��
		Queue<Position> queue = new LinkedList<>();
		// �̵� ��� �ִ� �Ÿ��� �˱����� ��
		int[][] count = new int[mapHeight][mapWidth];
		
		// ������ ������ �ƴ��� Ȯ��
		boolean[][] visited = new boolean[mapHeight][mapWidth];
		
		// queue�� ���� �ִ� �� offer();
		// �÷��̾��� �ʱⰪ �ֱ�
		queue.offer(new Position(0,0));
		count[0][0] = 1;
		visited[0][0] = true;
		
		while(!queue.isEmpty()) {
			// queue�� ���� �������� �� poll();
			Position current = queue.poll();
			
			int currentCount = count[current.y][current.x];
			
			// 4���� ���
			int[][] moving = {{0,-1},{0,1},{-1,0},{1,0}};
			for(int i = 0; i < moving.length; i ++) {
				// ���� �̵��ϰ� �� ��ġ
				Position moved = new Position(current.x + moving[i][0], current.y + moving[i][1]);
				if(!moved.isValid(mapWidth, mapHeight)) {
					continue;
				}
				if(visited[moved.y][moved.x]) continue;
				if(maps[moved.y][moved.x] == 0) continue;	// 0 : �� , 1 : ��
				
				// �̵��ϰԵ� count��
				count[moved.y][moved.x] = currentCount + 1;
				visited[moved.y][moved.x] = true;
				queue.offer(moved);
				
			}
			
			// �̵��ϰ� �� ���� �̹� ������ ���̶��
			// ���� �ƴ� ��� : maps[moved.y][moved.x] != 1
			// ���� ���� ������ ����� ��� : !(moved.x < 0 || moved.x >= mapWidth || moved.y < 0 || moved.y >= mapHeight)
			//if(!visited[moved.y][moved.x] && maps[moved.y][moved.x] != 1 && moved.isValid(mapWidth, mapHeight)) {
			//	// �̵��ϰԵ� count��
			//	count[moved.y][moved.x] = currentCount + 1;
			//	queue.offer(moved);
			//}
			
			// 4���� ���
			// BFS�� Ǫ�� ���� �⺻���� ���
			//queue.offer(new Position(current + 1, current));	// ��
			//queue.offer(new Position(current - 1, current));	// ��
			//queue.offer(new Position(current, current + 1));	// ��
			//queue.offer(new Position(current, current - 1));	// ��
		}
		
		// ������
		int answer = count[mapHeight - 1][mapWidth - 1];
		// �������� ���� ���
		if(answer == 0) {
			return -1;
		} else {
			return answer;
		}
	}

}
