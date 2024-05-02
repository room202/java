package j0501;

public class Main6 {
    public static void main(String[] args) {
        // 0xと書いたら以降の数値は16進数として表記できる
        int a = 0x0A;
        System.out.println(a);
        // 0bと書いたら以降の数値は2進数として表記できる
        int b = 0b1111;     
        System.out.println(b);
        // 0と書いたら以降の数値は8進数として表記できる
        // 0～7
        int c = 05;
        System.out.println(c);
    }
}
