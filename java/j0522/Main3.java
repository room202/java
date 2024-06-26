package j0522;

public class Main3 {
    public static void main(String[] args) {
        int age = 20;   // 年齢を入れる変数

        // 18歳以上かを boolean で確認する
        System.out.println(age >= 18);

        // 18歳以上では無いかを boolean で確認する
        System.out.println(!(age >= 18));
        // ↓
        System.out.println(!(true));
        // ↓
        System.out.println(false);

    }
}
