package Chap01;

public class Programers_03 {
	
	public int[] solution(String[] park, String[] routes) {
        // 시작 위치 초기화
        int posX = -1, posY = -1;
        // 시작 위치 찾기
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    posX = i;
                    posY = j;
                    break;
                }
            }
            if (posX != -1) break; // 시작 위치를 찾았다면 반복 중단
        }

        int[] position = {posX, posY}; // 현재 위치
        // 명령 수행
        for (String route : routes) {
            String[] command = route.split(" ");
            char direction = command[0].charAt(0); // 이동 방향
            int steps = Integer.parseInt(command[1]); // 이동 거리

            // 임시 위치
            int nextX = position[0];
            int nextY = position[1];

            // 이동 검증
            for (int i = 0; i < steps; i++) {
                switch (direction) {
                    case 'N': nextX--; break;
                    case 'S': nextX++; break;
                    case 'E': nextY++; break;
                    case 'W': nextY--; break;
                }

                // 공원 범위를 벗어나거나 장애물을 만나면 중단
                if (nextX < 0 || nextX >= park.length || nextY < 0 || nextY >= park[0].length() || park[nextX].charAt(nextY) == 'X') {
                    nextX = position[0]; // 원래 위치로 롤백
                    nextY = position[1];
                    break;
                }
            }

            // 실제 위치 업데이트
            position[0] = nextX;
            position[1] = nextY;
        }

        return position; // 최종 위치 반환
    }

	public static void main(String[] args) {
		Programers_03 solution = new Programers_03();
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        int[] result = solution.solution(park, routes);
        System.out.println("[" + result[0] + "," + result[1] + "]"); // 결과 출력
	}

}
