public class Task5 {
    public static void main(String[] args)
    {
        int[] my_array = {5, 6, 7, 12, -5, 32, 43, 6, 12};

        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    }
}
