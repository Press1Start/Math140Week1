import java.util.Scanner;

public class weekOne {
    public static void main(String[] args) {
        System.out.println("Welcome to Math 140 week 1. What is your name?");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        System.out.println("Hello " + name + "!");
        System.out.println("How long have you been coding?");
        String answer = keyboard.next();
        System.out.println("Wow, great job " + name + ".");
        String space = keyboard.nextLine();
        System.out.println("Welcome to my house! Would you like something to drink?");
        String response = keyboard.next();
        System.out.println("Awesome! " + name + " I will see if I can bring you that right away!");


    }
}
