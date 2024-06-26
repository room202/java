package j0619;

public class Main5 {
    public static void main(String[] args) {
        int x = 10;
        add(x);
        System.out.println("main : " + x);
    }

    //                        10
    public static void add(int x) {
        x = 999;
        System.out.println("add : " + x);
    }
}
