package SelfStudyJava.Chap08.exam06;

public class MyClass {
    //Field
    RemoteControl rc = new Television();

    //Constructor
    MyClass() {

    }
    MyClass(RemoteControl rc){
        this.rc = rc;
        rc.turnOn();
        rc.turnOff();
        rc.setVolumne(5);
    }

    //Method
    void methodA() {
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        rc.setVolumne(5);
    }
    void methodB(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
