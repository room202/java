package j0508;

public class Main9 {
    public static void main(String[] args) {
        System.out.println("あなたの名前を入力してください。");
        String name = new java.util.Scanner(System.in, "Shift-JIS").nextLine();
        System.out.println("あなたの年齢を入力してください。");
        int age = new java.util.Scanner(System.in).nextInt();
        System.out.println("ようこそ、" + age + "歳の" + name + "さん");
    }
}
