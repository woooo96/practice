package sparta;
import java.util.Scanner;


public class Bus {
    public static int count=0;
    int busNum=1000;
    int maxPeople=30;
    int fare=1000;
    String status="운행";
    int gas=100;
    int speed=0;
    int people;



    Bus () {
        count++;
        this.busNum+=count;

        System.out.println("버스"+count+"번호 = "+this.busNum);
    }

    boolean busStatus() {
        if (this.gas < 10) {
            this.status="차고지행";
            System.out.println("현재 주유량은 "+this.gas+" 입니다.");
            System.out.println("주유량이 부족합니다. 주유가 필요합니다.");
            System.out.println("현재 버스 상태는 " + this.status + "입니다.");
            return false;
        } else {
            this.status = "운행";
            System.out.println("현재 버스 상태는 " + this.status + "입니다.");
            System.out.println("현재 주유량은 "+this.gas+" 입니다.");

            return true;
        }
    }
    void getOnBus(int people) {
        if (this.people+people <= maxPeople) {
            if (busStatus()) {
                this.people+=people;
                System.out.println("현재 승객 인원은 "+this.people+"명 입니다. 잔여 승객 인원은 "+(this.maxPeople-this.people)+"입니다");
                System.out.println("요금은 "+(people*fare)+"입니다.");
            } else {
                System.out.println("탑승이 불가능합니다.");
            }
        } else {
            System.out.println("정원 초과입니다. 다음버스를 이용해 주세요.");
        }
    }
    void speedChange(int speed) {
        if (this.gas < 10) {
            System.out.println("주유량이 부족해서 속도 변경이 불가능합니다. 주유량을 확인해 주세요");
        } else {
            this.speed+=speed;
            System.out.println("변경된 속력은 "+this.speed+"입니다.");
        }
    }



    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        while(true) {
            System.out.println("---------------------------------");
            if (bus1.busStatus()) {
                Scanner s = new Scanner(System.in);
                System.out.println("");
                System.out.println("탑승 할 승객의 인원을 적어주세요.");
                int people=s.nextInt();
                bus1.getOnBus(people);
                System.out.println("");
                System.out.println("속도를 변경합니다. 변경하실 속력을 입력해주세요.");
                int speed=s.nextInt();
                bus1.speedChange(speed);

            } else {
                break;
            }
            bus1.gas-=5;
        }
    }
}