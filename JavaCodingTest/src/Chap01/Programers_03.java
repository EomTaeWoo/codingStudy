package Chap01;

public class Programers_03 {
	
	public int[] solution(String[] park, String[] routes) {
        // ���� ��ġ �ʱ�ȭ
        int posX = -1, posY = -1;
        // ���� ��ġ ã��
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    posX = i;
                    posY = j;
                    break;
                }
            }
            if (posX != -1) break; // ���� ��ġ�� ã�Ҵٸ� �ݺ� �ߴ�
        }

        int[] position = {posX, posY}; // ���� ��ġ
        // ��� ����
        for (String route : routes) {
            String[] command = route.split(" ");
            char direction = command[0].charAt(0); // �̵� ����
            int steps = Integer.parseInt(command[1]); // �̵� �Ÿ�

            // �ӽ� ��ġ
            int nextX = position[0];
            int nextY = position[1];

            // �̵� ����
            for (int i = 0; i < steps; i++) {
                switch (direction) {
                    case 'N': nextX--; break;
                    case 'S': nextX++; break;
                    case 'E': nextY++; break;
                    case 'W': nextY--; break;
                }

                // ���� ������ ����ų� ��ֹ��� ������ �ߴ�
                if (nextX < 0 || nextX >= park.length || nextY < 0 || nextY >= park[0].length() || park[nextX].charAt(nextY) == 'X') {
                    nextX = position[0]; // ���� ��ġ�� �ѹ�
                    nextY = position[1];
                    break;
                }
            }

            // ���� ��ġ ������Ʈ
            position[0] = nextX;
            position[1] = nextY;
        }

        return position; // ���� ��ġ ��ȯ
    }

	public static void main(String[] args) {
		Programers_03 solution = new Programers_03();
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        int[] result = solution.solution(park, routes);
        System.out.println("[" + result[0] + "," + result[1] + "]"); // ��� ���
	}

}
