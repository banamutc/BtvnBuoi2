import java.util.Scanner;

public class ChickenDogProblem {
    public static void main(String[] args) {
        int totalFoot, totalChildren;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter total children : ");
        totalChildren = scanner.nextInt();
        while (totalChildren < 0) {
            System.out.println("Input is not valid");
            System.out.println(" re-enter total children : ");
            totalChildren = scanner.nextInt();
        }
        System.out.println(" enter total foot : ");
        totalFoot = scanner.nextInt();
        while (totalFoot < 0 && totalFoot % 2 != 0) {
            System.out.println("Input is not valid");
            System.out.println(" re-enter total foot : ");
            totalFoot = scanner.nextInt();
        }
        int a = 2 * totalChildren, b = totalFoot;
        if (a > b)
            System.out.println("invalid input");
        else if (a == b)
        {
            System.out.println("number of chicken is: " + a);
            System.out.println("number of dog is: "+ b/2);
        } else if (a < b) {
            if ((b - a) % 2!=0)
                System.out.println("invalid input");
            else
            {
                System.out.println("number of dog is: " + (b - a)/2);
                System.out.println("number of chicken is: " + (totalChildren-(b - a)/2));
            }

        }
    }
}
