package SelfStudyJava.Chap08.exam01;

public class SmartTelevisionExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();
        RemoteControl rc = tv;
        rc.turnOn();
        rc.turnOff();
        rc.setVolumne(5);

        Searchable searchable = tv;
        searchable.search("http://www.naver.com");
    }
}
