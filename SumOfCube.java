public class SumOfCube {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 100) {
            sum = sum + (i * i * i);  // accumulate cubes
            i++;
        }

        System.out.println("Sum of cubes from 1 to 100 is: " + sum);
    }
}