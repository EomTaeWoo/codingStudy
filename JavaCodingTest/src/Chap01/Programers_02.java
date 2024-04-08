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
        // terms ������� �����͸� map�� �ִ´�.
        Map<String, Integer> termsData = new HashMap<>();
        for(String term : terms) {
        	String[] part = term.split(" ");
        	// key = A, keyValue = 6 ���·� �־���.
        	termsData.put(part[0], Integer.parseInt(part[1]));
        }
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        // Date parse �޼��� ���� throws ParseException �߰��ؾ���
        Date todayDate = format.parse(today);
        
        for(int i = 0; i < privacies.length; i ++) {
        	String[] privaciesList = privacies[i].split(" ");
        	// privaciesList ����������������
        	String sdate = privaciesList[0];
        	Date startDate = format.parse(sdate);
        	cal.setTime(startDate);
        	// �������� ��� ����
        	String sGubun = privaciesList[1];
        	
        	// �������� ��� ������ ���� ��ȿ�Ⱓ
        	int privaciesMonth = termsData.get(sGubun);
        	
        	// ��ȿ�Ⱓ�� ���� �� ���
        	cal.add(Calendar.MONTH, privaciesMonth);
        	cal.add(Calendar.DAY_OF_MONTH, -1);		// ��ȿ�Ⱓ ������ �� ����
        	
        	// today�� ��
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
