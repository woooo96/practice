package SelfStudyJava.Chap09.exam01;

import fastcompus.ch12.Person;

public class Anonymous {
    Person field = new Person() {
        void work() {
            System.out.println("출근합니다.");
        }

        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        };
    };
    void method1() {
        Person localVar = new Person() {};
    }
}
