import java.util.Random;
import java.util.Scanner;

public class GetUserInfo1 {


    private static Random inputnput;

    public static void main(String[] args) {
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Pleas enter your age >> ");
        age = inputnput.nextInt();
        Scanner inputname = null;
        inputname.nextLine();
        System.out.println("Please enter your name >> ");
        name = input.nextLine();
        System.out.println("Your name is " + name + "and you are " + age);

    }

}
