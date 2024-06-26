package j0619;

public class MAin6 {
    public static void main(String[] args) {
        //    0x1000(array配列の先頭アドレス)
        int[] array = {1, 2, 3};
        // array[0] : 0x1000 => 1
        // array[1] : 0x1004 => 2
        // array[2] : 0x1008 => 3

        System.out.println("Before incArray()");
        for(int i : array) {
            System.out.println(i);
        }

        //      0x1000(array配列の先頭アドレス)
        incArray(array);

        System.out.println("After incArray()");
        for(int i : array) {
            System.out.println(i);
        }
    }
    //                                0x1000(array配列の先頭アドレス)
    public static void incArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i]++;
        }
        // array[0] : 0x1000 => 2
        // array[1] : 0x1004 => 3
        // array[2] : 0x1008 => 4
    }
}
