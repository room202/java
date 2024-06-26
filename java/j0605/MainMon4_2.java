package j0605;

public class MainMon4_2 {
    public static void main(String[] args) {
        // ①
        int[] moneyList = {121902, 8302, 55100};

        // ②
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }

        // ③
        for(int money : moneyList) {
            System.out.println(money);
        }
    }
}
