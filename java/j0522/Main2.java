package j0522;

public class Main2 {
    public static void main(String[] args) {
        String str1 = "スッキリ";
        String str2 = new String("スッキリ");

        System.out.println(str1);
        System.out.println(str2);

        if(str1.equals(str2)) {
            System.out.println("同じ文字列です。");
        } else {
            System.out.println("異なる文字列です");
        }
    }
}
