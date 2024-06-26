package j0612;

public class Main5_3 {
    public static void main(String[] args) {
        methodA();
        methodB();
    }

    public static void methodA() {
        System.out.println("methodA");
        methodB();
    }

    public static void methodB() {
        System.out.println("methodB");
    }
}
