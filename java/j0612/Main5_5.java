package j0612;

public class Main5_5 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        // 実引数
        add(x, y);
        System.out.println(x);
        System.out.println(y);

        add(100, 20);
        add(200, 50);
    }

    //                     仮引数
    public static void add(int x, int y) {
        int ans = x + y;
        System.out.println(x + "+" + y + "=" + ans);
        x = 10000;
        y = 20000;
    }
}
