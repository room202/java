package j0619;

public class Main3 {
    public static void main(String[] args) {
        // キーワード : 戻り値
        System.out.println( add(10, 20) );
        System.out.println( add(10.5, 20.5) );
        System.out.println( add("Hello", "World") );
        System.out.println( add(10, 10, 10) );
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    // オーバーロード
    public static double add(double x, double y) {
        return x + y;
    }

    public static String add(String x, String y) {
        return x + y;
    }
}
