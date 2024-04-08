package Programmers.SecondWeek;

import java.util.*;

public class MidtermTest {

	public static void main(String[] args) {
		int result = solution2(new int[] {2,3}, new int[] {1,2,4});
		System.out.println("결과 : "+ result);

	}
	
	public int solution(int[] people, int[] tshirts) {
        int answer = 0;

        Arrays.sort(people);
        Arrays.sort(tshirts);

        int p=0;//사람 index
        int t=0;//티셔츠 index
        while(p<people.length && t<tshirts.length){

            if(people[p]<=tshirts[t]){//p번째 사람이 t번째 티셔츠를 받을 수 있는 경우
                answer++;
                p++;t++;
            }else{//p번째 사람이 t번째 티셔츠를 받지 못하는 경우 더 큰 티셔츠를 가져옴.
                t++;
            }
        }

        return answer;
    }
	////////////////////////////////
	public static int solution2(int[] people, int[] tshirts) {
        int answer = 0;

        Arrays.sort(people);
        Arrays.sort(tshirts);
        
        for(int i=0; i<people.length; i++){
            for(int j=0; j<tshirts.length; j++){
                if(people[i] <= tshirts[j]){
                    answer++;
                    tshirts[j] = 0;
                    break;
                }
            }
        }
        return answer;
    }
	//////////////////////////////
	
	public String[] solution(String[][] booked, String[][] unbooked) {
        String[] answer = {};

        ArrayList<String> answerList = new ArrayList<>();//고객 이름 처리순으로 담기

        int idxBook=0;
        int idxUnbook=0;
        int time=0;//현재 시각 -> 분으로 나타냄

        while(idxBook<booked.length || idxUnbook<unbooked.length){//두 개 다 인덱스 끝까지 방문할 때까지 반복

            //도착한 시간 분으로 바꾸기
            //만약, 인덱스 끝까지 조사하면 24시값인 1440넣어줘서 계산 못하게 함.
            int bookTime = idxBook<booked.length? arriveToMin(booked[idxBook][0]):1440;
            int unbookTime = idxUnbook<unbooked.length? arriveToMin(unbooked[idxUnbook][0]):1440;

            //현재시각에 고객이 아무도 없으면 먼저 온 사람부터 받음
            if(time<bookTime && time<unbookTime){
                if(bookTime<=unbookTime){//예약된 사람이 더 빨리 온 경우
                    answerList.add(booked[idxBook++][1]);//손님 이름 answer에 넣고, index증가
                    time=bookTime+10;//예약 손님 상담 끝난 시간으로 보냄

                }else{//예약 안한 사람이 더 빨리 온 경우
                    answerList.add(unbooked[idxUnbook++][1]);
                    time=unbookTime+10;
                }
            }else if(time>=bookTime){//예약손님을 받을 수 있는 경우
                answerList.add(booked[idxBook++][1]);//예약 손님 받고, answer에 추가
                time+=10;
            }else{//예약 안 한 손님의 경우
                answerList.add(unbooked[idxUnbook++][1]);
                time+=10;
            }
        }
        answer=answerList.toArray(new String[answerList.size()]);

        return answer;
    }
    //도착한 시각을 숫자로 저장하기 위해 분(minutes)으로 바꾸기
    int arriveToMin(String time){
        String[] t = time.split(":");

        return ((Integer.parseInt(t[0]))*60+Integer.parseInt(t[1]));
    }
    /////////////////////////////////////////////
    public String[] solution2(String[][] booked, String[][] unbooked) {
        ArrayList<String> result = new ArrayList<>();
        
        Queue<String[]> bookedCustomer = new LinkedList<>();
        Queue<String[]> unbookedCustomer = new LinkedList<>();

        for(int i=0; i<booked.length; i++){

            booked[i][0] = String.valueOf(Integer.parseInt(booked[i][0].substring(0, 2)) * 60 + Integer.parseInt(booked[i][0].substring(3, 5)));
            bookedCustomer.offer(new String[]{booked[i][0], booked[i][1]});
        }

        for(int i=0; i<unbooked.length; i++){
            unbooked[i][0] = String.valueOf(Integer.parseInt(unbooked[i][0].substring(0, 2)) * 60 + Integer.parseInt(unbooked[i][0].substring(3, 5)));
            unbookedCustomer.offer(new String[]{unbooked[i][0], unbooked[i][1]});
        }

        int currentTime = Math.min(Integer.parseInt(booked[0][0]), Integer.parseInt(unbooked[0][0]));

        while(!bookedCustomer.isEmpty() || !unbookedCustomer.isEmpty()){
            if(bookedCustomer.isEmpty()){
                while(!unbookedCustomer.isEmpty()){
                    result.add(unbookedCustomer.poll()[1]);
                }
                break;
            }
            else if(unbookedCustomer.isEmpty()){
                while(!bookedCustomer.isEmpty()){
                    result.add(bookedCustomer.poll()[1]);
                }
                break;
            }

            int bookedTime = Integer.parseInt(bookedCustomer.peek()[0]);
            int unbookedTime = Integer.parseInt(unbookedCustomer.peek()[0]);

            if(bookedTime <= currentTime){
                result.add(bookedCustomer.poll()[1]);

                currentTime += 10;
            }
            else if(unbookedTime <= currentTime){
                result.add(unbookedCustomer.poll()[1]);

                currentTime += 10;
            }
            else{
                if(bookedTime < unbookedTime){
                    result.add(bookedCustomer.peek()[1]);
                    currentTime = Integer.parseInt(bookedCustomer.poll()[0]) + 10;
                }
                else{
                    result.add(unbookedCustomer.peek()[1]);
                    currentTime = Integer.parseInt(unbookedCustomer.poll()[0]) + 10;
                }

            }
        }

        String[] answer = new String[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
    ////////////////////////////
    public String[] solution3(String[][] booked, String[][] unbooked) {
        Queue<Customer> bookedCustomers = new LinkedList<>();
        for(String[] customer : booked){
            bookedCustomers.offer(new Customer(customer[0], customer[1]));
        }

        Queue<Customer> unBookedCustomers = new LinkedList<>();
        for(String[] customer : unbooked){
            unBookedCustomers.offer(new Customer(customer[0], customer[1]));
        }

        List<String> answer = new LinkedList<>();

        int currentTime = Math.min(bookedCustomers.peek().getArrivedAt(), unBookedCustomers.peek().getArrivedAt());

        while(!bookedCustomers.isEmpty() || !unBookedCustomers.isEmpty()){
            if(bookedCustomers.isEmpty()){
                for(Customer c : unBookedCustomers){
                    answer.add(c.getName());
                }
                break;
            }

            if(unBookedCustomers.isEmpty()){
                for(Customer c : bookedCustomers){
                    answer.add(c.getName());
                }
                break;
            }

            Customer bookedCustomer = bookedCustomers.peek();
            Customer unBookedCustomer = unBookedCustomers.peek();

            if(currentTime >= bookedCustomer.getArrivedAt()){
                answer.add(bookedCustomers.poll().getName());
                currentTime += 10;
            }else if (currentTime >= unBookedCustomer.getArrivedAt()){
                answer.add(unBookedCustomers.poll().getName());
                currentTime += 10;
            }else{
                Customer customer;
                if(bookedCustomer.getArrivedAt() < unBookedCustomer.getArrivedAt()){
                    customer = bookedCustomers.poll();
                }else{
                    customer = unBookedCustomers.poll();
                }
                answer.add(customer.getName());
                currentTime =  customer.getArrivedAt() + 10;
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
    class Customer{
        int arrivedAt;
        String name;

        public Customer(String arrivedAt, String name){
            this.arrivedAt = parseTime(arrivedAt);
            this.name = name;
        }

        public int getArrivedAt() {
            return arrivedAt;
        }

        public String getName(){
            return name;
        }

        public int parseTime(String time){
            String[] str = time.split(":");
            return Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
        }

    }
    //////////////////////////////////////////// 모범답안
    class CustomerUp {
        final int arrivedAt;
        final String name;

        CustomerUp(String name, String arrivedAt) {
            this.name = name;
            this.arrivedAt = parseTime(arrivedAt);
        }

        private int parseTime(String time) {
            // 시간(String)을 분(Int)으로 변경
            String[] s = time.split(":");
            return Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
        }
    }

        public String[] solutionUp(String[][] booked, String[][] unbooked) {
            // Customer 객체로 변환
            Queue<Customer> bookedCustomers = new LinkedList<>();
            for (String[] customer : booked) {
                bookedCustomers.offer(new Customer(customer[1], customer[0]));
            }
            Queue<Customer> unbookedCustomers = new LinkedList<>();
            for (String[] customer : unbooked) {
                unbookedCustomers.offer(new Customer(customer[1], customer[0]));
            }

            List<String> answer = new LinkedList<>();

            // 시간의 시작은 먼저 온 고객의 도착시간
            int currentTime = Math.min(bookedCustomers.peek().arrivedAt, unbookedCustomers.peek().arrivedAt);

            while (!bookedCustomers.isEmpty() || !unbookedCustomers.isEmpty()) {
                if (bookedCustomers.isEmpty()) {
                    // 예약된 고객이 없는 경우 예약되지 않은 고객을 모두 추가하고 종료
                    for (Customer c : unbookedCustomers) answer.add(c.name);
                    break;
                }
                if (unbookedCustomers.isEmpty()) {
                    // 예약되지 않은 고객이 없는 경우 예약된 고객을 모두 추가하고 종료
                    for (Customer c : bookedCustomers) answer.add(c.name);
                    break;
                }

                final Customer bookedCustomer = bookedCustomers.peek();
                final Customer unbookedCustomer = unbookedCustomers.peek();

                if (currentTime >= bookedCustomer.arrivedAt) {
                    // 현재시간이 예약된 고객의 도착시간 이후하면 예약 고객을 바로 상담
                    answer.add(bookedCustomers.poll().name);
                    currentTime += 10; // 다음 평가시간은 상담이 종료되는 10분 후
                } else if (currentTime >= unbookedCustomer.arrivedAt) {
                    // 현재시간이 예약되지 않은 고객의 도착시간 이후하면 비예약 고객을 바로 상담
                    answer.add(unbookedCustomers.poll().name);
                    currentTime += 10; // 다음 평가시간은 상담이 종료되는 10분 후
                } else {
                    Customer c;
                    // 예약/비예약 고객 중 먼저 온 고객을 상담하고
                    if (bookedCustomer.arrivedAt < unbookedCustomer.arrivedAt) {
                        c = bookedCustomers.poll();
                    } else {
                        c = unbookedCustomers.poll();
                    }
                    answer.add(c.name);
                    // 다음 평가시간은 고객의 상담이 종료되는 도착시간의 10분 후
                    currentTime = c.arrivedAt + 10;
                }
            }

            return answer.toArray(String[]::new);
        }

}
