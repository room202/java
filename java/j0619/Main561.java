package j0619;

// javac j0619/Main561.java
// javac -d . j0619/Main561.java
// java j0619.Main561
public class Main561 {
    public static void main(String[] args) {
        System.out.println("コマンドライン引数の内容");
        for(String arg : args) {
            System.out.println(arg);
        }
    }
}
