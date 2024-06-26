package j0605;

public class Main10 {
    public static void main(String[] args) {
        int[][] scores = {
        //  1列目～3列目
            {40, 50, 60}, // 1行目
            {80, 60, 70}  // 2行目
        };
        System.out.println(scores.length + "行");      // 行数
        System.out.println(scores[0].length + "列");   // 列数
    }
}
