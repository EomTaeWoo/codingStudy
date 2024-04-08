package Programmers.SecondWeek;

import java.util.*;

public class MidtermTest {

	public static void main(String[] args) {
		int result = solution2(new int[] {2,3}, new int[] {1,2,4});
		System.out.println("��� : "+ result);

	}
	
	public int solution(int[] people, int[] tshirts) {
        int answer = 0;

        Arrays.sort(people);
        Arrays.sort(tshirts);

        int p=0;//��� index
        int t=0;//Ƽ���� index
        while(p<people.length && t<tshirts.length){

            if(people[p]<=tshirts[t]){//p��° ����� t��° Ƽ������ ���� �� �ִ� ���
                answer++;
                p++;t++;
            }else{//p��° ����� t��° Ƽ������ ���� ���ϴ� ��� �� ū Ƽ������ ������.
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

        ArrayList<String> answerList = new ArrayList<>();//�� �̸� ó�������� ���

        int idxBook=0;
        int idxUnbook=0;
        int time=0;//���� �ð� -> ������ ��Ÿ��

        while(idxBook<booked.length || idxUnbook<unbooked.length){//�� �� �� �ε��� ������ �湮�� ������ �ݺ�

            //������ �ð� ������ �ٲٱ�
            //����, �ε��� ������ �����ϸ� 24�ð��� 1440�־��༭ ��� ���ϰ� ��.
            int bookTime = idxBook<booked.length? arriveToMin(booked[idxBook][0]):1440;
            int unbookTime = idxUnbook<unbooked.length? arriveToMin(unbooked[idxUnbook][0]):1440;

            //����ð��� ���� �ƹ��� ������ ���� �� ������� ����
            if(time<bookTime && time<unbookTime){
                if(bookTime<=unbookTime){//����� ����� �� ���� �� ���
                    answerList.add(booked[idxBook++][1]);//�մ� �̸� answer�� �ְ�, index����
                    time=bookTime+10;//���� �մ� ��� ���� �ð����� ����

                }else{//���� ���� ����� �� ���� �� ���
                    answerList.add(unbooked[idxUnbook++][1]);
                    time=unbookTime+10;
                }
            }else if(time>=bookTime){//����մ��� ���� �� �ִ� ���
                answerList.add(booked[idxBook++][1]);//���� �մ� �ް�, answer�� �߰�
                time+=10;
            }else{//���� �� �� �մ��� ���
                answerList.add(unbooked[idxUnbook++][1]);
                time+=10;
            }
        }
        answer=answerList.toArray(new String[answerList.size()]);

        return answer;
    }
    //������ �ð��� ���ڷ� �����ϱ� ���� ��(minutes)���� �ٲٱ�
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
    //////////////////////////////////////////// ������
    class CustomerUp {
        final int arrivedAt;
        final String name;

        CustomerUp(String name, String arrivedAt) {
            this.name = name;
            this.arrivedAt = parseTime(arrivedAt);
        }

        private int parseTime(String time) {
            // �ð�(String)�� ��(Int)���� ����
            String[] s = time.split(":");
            return Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
        }
    }

        public String[] solutionUp(String[][] booked, String[][] unbooked) {
            // Customer ��ü�� ��ȯ
            Queue<Customer> bookedCustomers = new LinkedList<>();
            for (String[] customer : booked) {
                bookedCustomers.offer(new Customer(customer[1], customer[0]));
            }
            Queue<Customer> unbookedCustomers = new LinkedList<>();
            for (String[] customer : unbooked) {
                unbookedCustomers.offer(new Customer(customer[1], customer[0]));
            }

            List<String> answer = new LinkedList<>();

            // �ð��� ������ ���� �� ���� �����ð�
            int currentTime = Math.min(bookedCustomers.peek().arrivedAt, unbookedCustomers.peek().arrivedAt);

            while (!bookedCustomers.isEmpty() || !unbookedCustomers.isEmpty()) {
                if (bookedCustomers.isEmpty()) {
                    // ����� ���� ���� ��� ������� ���� ���� ��� �߰��ϰ� ����
                    for (Customer c : unbookedCustomers) answer.add(c.name);
                    break;
                }
                if (unbookedCustomers.isEmpty()) {
                    // ������� ���� ���� ���� ��� ����� ���� ��� �߰��ϰ� ����
                    for (Customer c : bookedCustomers) answer.add(c.name);
                    break;
                }

                final Customer bookedCustomer = bookedCustomers.peek();
                final Customer unbookedCustomer = unbookedCustomers.peek();

                if (currentTime >= bookedCustomer.arrivedAt) {
                    // ����ð��� ����� ���� �����ð� �����ϸ� ���� ���� �ٷ� ���
                    answer.add(bookedCustomers.poll().name);
                    currentTime += 10; // ���� �򰡽ð��� ����� ����Ǵ� 10�� ��
                } else if (currentTime >= unbookedCustomer.arrivedAt) {
                    // ����ð��� ������� ���� ���� �����ð� �����ϸ� �񿹾� ���� �ٷ� ���
                    answer.add(unbookedCustomers.poll().name);
                    currentTime += 10; // ���� �򰡽ð��� ����� ����Ǵ� 10�� ��
                } else {
                    Customer c;
                    // ����/�񿹾� �� �� ���� �� ���� ����ϰ�
                    if (bookedCustomer.arrivedAt < unbookedCustomer.arrivedAt) {
                        c = bookedCustomers.poll();
                    } else {
                        c = unbookedCustomers.poll();
                    }
                    answer.add(c.name);
                    // ���� �򰡽ð��� ���� ����� ����Ǵ� �����ð��� 10�� ��
                    currentTime = c.arrivedAt + 10;
                }
            }

            return answer.toArray(String[]::new);
        }

}
