package j0508;

public class Main3 {
    public static void main(String[] args) {
        float f = 3; // 3.0Fで変数fに型変換して代入
        double d = f; // double型はfloat型より大きいので代入できる
        System.out.println(f);
        System.out.println(d);
        int i = (int)3.2;
        System.out.println(i);
    }
}
