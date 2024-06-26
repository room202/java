package j0522;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("あなたの運勢を占います");
        int fortune = new java.util.Random().nextInt(5) + 1;

        switch(fortune) {
            case 1, 2 : 
                System.out.println("いいね！");
                break;
            case 3 :
                System.out.println("普通です");
                break;
            case 4, 5 :
                System.out.println("うーん...");
                break;
        }

        String s = switch(fortune) {
            case 1 -> "大吉";
            case 2 -> "中吉";
            case 3 -> "吉";
            default -> "凶";
        };
        System.out.println(s);
    }
}
