package SelfStudyJava.Chap08.exam01;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolumne(5);
        rc.turnOff();
    }
}
