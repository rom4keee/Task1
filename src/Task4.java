public class Task4 {
    public static void main(String[] args) {
        int[] my_array = {5, 6, 7, 12, -5, 32, 43};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}
