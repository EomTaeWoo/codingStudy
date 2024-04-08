package Chap01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programers_02 {
	
	
    public List<Integer> solution(String today, String[] terms, String[] privacies) throws ParseException {
        //int[] answer = {};
        List<Integer> answer = new ArrayList<>();
        // terms 약관종류 데이터를 map에 넣는다.
        Map<String, Integer> termsData = new HashMap<>();
        for(String term : terms) {
        	String[] part = term.split(" ");
        	// key = A, keyValue = 6 형태로 넣었다.
        	termsData.put(part[0], Integer.parseInt(part[1]));
        }
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        // Date parse 메서드 사용시 throws ParseException 추가해야함
        Date todayDate = format.parse(today);
        
        for(int i = 0; i < privacies.length; i ++) {
        	String[] privaciesList = privacies[i].split(" ");
        	// privaciesList 개인정보수집일자
        	String sdate = privaciesList[0];
        	Date startDate = format.parse(sdate);
        	cal.setTime(startDate);
        	// 개인정보 약관 종류
        	String sGubun = privaciesList[1];
        	
        	// 개인정보 약관 종류에 대한 유효기간
        	int privaciesMonth = termsData.get(sGubun);
        	
        	// 유효기간에 대한 월 계산
        	cal.add(Calendar.MONTH, privaciesMonth);
        	cal.add(Calendar.DAY_OF_MONTH, -1);		// 유효기간 마지막 날 포함
        	
        	// today와 비교
        	if(cal.getTime().before(todayDate)) {
        		answer.add(i+1);
        	}
        }
        
        
        
        return answer;
    }
	

	public static void main(String[] args) throws ParseException {
		Programers_02 T = new Programers_02();
		
		String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        
        List<Integer> result = T.solution(today, terms, privacies);
        System.out.println(result);
		
	}

}
