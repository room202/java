package j0522;

public class Main6 {
    public static void main(String[] args) {
        int age = 17;
        //         (条件式) ? 条件成立時の値 : 条件不成立時の値
        String s = (age >= 18) ? "成人" : "未成年";
        System.out.println(s);
    }
}
