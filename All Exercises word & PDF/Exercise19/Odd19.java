public class Odd19 {

    public static void main(String args []){
        System.out.println("integers within range 100-150 whose sum is an even number");

        for (int i = 100; i < 150; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                int digit = num %10;
                sum = sum + digit;
                num = num /10;
            }
            if (sum%2 != 0) {
                System.out.println(i);
            }
        }
    }

}