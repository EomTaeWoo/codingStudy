package Chap01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programers_02_01 {
    
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        // 약관별 유효기간을 맵에 저장
        for (String term : terms) {
            String[] termDetail = term.split(" ");
            termMap.put(termDetail[0], Integer.parseInt(termDetail[1]));
        }
        
        List<Integer> expiredList = new ArrayList<>();
        // 개인정보 파기 여부 확인
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyDetail = privacies[i].split(" ");
            String expireDate = calculateExpireDate(privacyDetail[0], termMap.get(privacyDetail[1]));
            if (expireDate.compareTo(today) < 0) {
                expiredList.add(i + 1);
            }
        }
        
        // 결과 배열로 변환
        return expiredList.stream().mapToInt(i->i).toArray();
    }

    // 유효기간 계산 헬퍼 메소드
    private String calculateExpireDate(String startDate, int months) {
        String[] dateParts = startDate.split("\\.");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]) + months;
        
        year += (month - 1) / 12;
        month = (month - 1) % 12 + 1;
        
        return String.format("%04d.%02d.%s", year, month, dateParts[2]);
    }

    public static void main(String[] args) {
    	Programers_02_01 solution = new Programers_02_01();
        
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        
        int[] result = solution.solution(today, terms, privacies);
        for (int num : result) {
            System.out.println(num);
        }
    }
}
