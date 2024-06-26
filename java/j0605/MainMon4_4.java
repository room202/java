package j0605;

public class MainMon4_4 {
    public static void main(String[] args) {
        // ①
        int[] numbers = {3, 4, 9};
        // ②
        System.out.print("1桁の数字を入力してください > ");
        // ③
        int input = new java.util.Scanner(System.in).nextInt();
        // ④
        for(int number : numbers) {
            if(input == number) {
                System.out.println("アタリ！");
            }
        }
    }
}
