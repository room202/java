package j0522;

public class Main9 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++) {
            // ここがネストの部分
            for(int j = 1; j <= 9; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
