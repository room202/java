package j0529;

public class Main7 {
    public static void main(String[] args) {
        // 練習3-5
        // ①
        System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");

        // ②
        int selected = new java.util.Scanner(System.in).nextInt();

        // ③④
        switch(selected) {
            // 旧式
            // case 1 : 
            //     System.out.println("検索します");
            //     break;
            case 1 -> {
                System.out.println("検索します");
            }
            case 2 -> {
                System.out.println("登録します");
            }
            case 3 -> {
                System.out.println("削除します");
            }
            case 4 -> {
                System.out.println("変更します");
            }
        }
    }
}
