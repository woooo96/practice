package SelfStudyJava.Chap06;

public class Korean {
    //Field
    String nation = "대한민국";
    String name;
    String ssn;

    Korean(String name, String ssn) {
        this.name=name;
        this.ssn=ssn;
    }
}

class KoreanExample {
    public static void main(String[] args){
        Korean k1 = new Korean("최진우", "961111-1111111");
        Korean k2 = new Korean("김규리", "971111-2222222");
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);
    }
}