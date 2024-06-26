package j0619;

public class Main {
    public static void main(String[] args) {
        // 変数のスコープ(変数の有効範囲)
        int x = 100;
        int y = 10;

        add();
    }
    //       戻り値の型 メソッド名(引数なし)
    public static void add() {
        int ans = x + y;
        System.out.println(x + "+" + y + "=" + ans);
    }
}
