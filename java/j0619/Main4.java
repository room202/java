package j0619;

public class Main4 {
    public static void main(String[] args) {
        // 配列を作成
        int[] array = {1, 2, 3};
        printArray(array);
    }

    public static void printArray(int[] array) {
        // 拡張forで引数の配列を全てループ
        for(int element : array) {
            System.out.println(element);
        }
    }
}
