package Chap07.exam01;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바홈", "검정", 10);

        System.out.println(dmbCellPhone.model);
        System.out.println(dmbCellPhone.color);
        System.out.println(dmbCellPhone.channel);

//        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoid("안녕하세요! 저는 홍길동인데요");
        dmbCellPhone.sendVoice("아~ 반갑습니다.");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();


    }
}
