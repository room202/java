package j0612;

public class MainMondai4_4 {
    public static void main(String[] args) {
        // ①
        int[] numbers = {3, 4, 9};
        // ②
        System.out.println("1桁の数字を入力してください");
        // ③
        int input = new java.util.Scanner(System.in).nextInt();
        // ④
        for(int number : numbers) {
            if(number == input) {
                System.out.println("アタリ！");
            }
        }
    }
}
