import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int interger = input();
//        System.out.println(number);
        check(interger);
    }

    private static int input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer :");
        int interger = scanner.nextInt();
        return interger;
    }

    private static void check(int number) {

        while (number == 0) {
            System.out.println("invalid input");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Invite to re -enter:");
            number = scanner.nextInt();
        }
        if(number > 0) {
            System.out.println(number +" is positive integer");
        }
        else  {
            System.out.println(number +" is the vowel integer");
        }
    }
}
