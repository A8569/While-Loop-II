public class SumOfOdd {
    public static void main (String[] args) {

        int sum = 0;
        for (int i = 2; i <= 100; i += 3) {
            sum = sum + i;
            System.out.println("Sum of odd numbers from 1 to 100 is:" + sum);
        }
    }
}