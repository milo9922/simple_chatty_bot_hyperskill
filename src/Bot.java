import java.util.Scanner;

public class Bot {

    public static void main(String[] args) {
        greeting("Aid", "2020");
        guessAge();
        count();
        teach();
        end();
    }

    static void greeting(String botName, String birthYear) {
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
    }

    static void guessAge() {
        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        String reminders = scanner.nextLine();
        String[] remindersAsStringArray = reminders.split(" ");
        int[] remindersArray = new int[3];
        for (int i = 0; i < remindersArray.length; i++) {
            remindersArray[i] = Integer.parseInt(remindersAsStringArray[i]);
        }

        int age = (remindersArray[0] * 70 + remindersArray[1] * 21 + remindersArray[2] * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Completed, have a nice day!");
    }

    static void teach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int answer = 0;
        while (answer != 2) {
            answer = scanner.nextInt();

            if (answer != 2) {
                System.out.println("Please, try again.");
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
