package SelfStudyJava.Chap08.exam11;

public class Example {
    public static void main(String[] args) {
        ImplementationC imp1 = new ImplementationC();
        InterfaceA ia = imp1;
        ia.methodA();

        InterfaceB ib = imp1;
        ib.methodB();

        InterfaceC ic = imp1;
        ic.methodC();
        ic.methodA();
        ic.methodB();
    }
}
