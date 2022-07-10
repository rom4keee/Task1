public class Task_1_P_2 {

    public static void main(String[] args)
    {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        String str3 = str1.concat(str2);
        String str4 = str3.replace("P", "");
        System.out.println("The concatenated string with replacement: " + str4);

    }
}