package sparta;

public class Taxi {
    public static int count = 0;
    static int taxiNum = 1000;
    int maxPeople = 4;
    int defaultFare = 3000;
    int driveFare = 1000;
    int defaultdrive = 1;
    int gas = 100;
    String status = "일반";
    int speed = 0;
    int people;
    String destination;
    int destDrive;


    Taxi() {
        count++;
        this.taxiNum += count;

        System.out.println("택시"+count+"번호 : " + this.taxiNum);
        System.out.println("주유량 = " + this.gas);
        System.out.println("상태 = " + this.status);
    }


    boolean taxiStatus() {
        if (gas < 10) {
            System.out.println("주유량 부족. 운행 불가능");
            this.status = "탑승 불가";
            return false;
        } else {
            return true;
        }
    }

    void getOnTaxi(int people, String destination, int destDrive) {
        if (this.status.equals("일반")) {
            if (maxPeople >= people) {
                this.people = people;
                this.destination = destination;
                this.destDrive = destDrive;
                this.status = "운행 중";

                //(목적지까지거리-기본거리)*(거리당 추가요금)+기본요금;
                int sumFare = (destDrive - defaultdrive) * driveFare + defaultFare;

                System.out.println("탑승 승객 수 = " + this.people);
                System.out.println("잔여 승객 수 = " + (maxPeople - this.people));
                System.out.println("기본 요금 확인 = " + this.defaultdrive);
                System.out.println("목적지 = " + this.destination);
                System.out.println("목적지까지 거리 = " + this.destDrive);
                System.out.println("지불할 요금 = " + sumFare);
                System.out.println("상태 = " + this.status);
            } else {
                System.out.println("최대 승객 수 초과");
            }
        } else {
            this.status = "탑승 불가";
            System.out.println(this.status);
        }
    }

    void speedChange(int speed) {
        this.speed += speed;
        System.out.println("속도 = " + this.speed);
    }
}




