import java.util.Scanner;

public class AskDob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which year did you born? ");
        int a = input.nextInt();
        System.out.println("you are year old.");
        int b = input.nextInt();
        System.out.println("you will be 23 years after 5 years");
        int c = input.nextInt();

        int year = 2003;
        int age = 17;
        int sum = age + 6;

        System.out.println("Which year did you born?" +year);
        System.out.println("You are " + age + " years old");
        System.out.println("you will be " +sum + " years after 5 year");
    }
}
