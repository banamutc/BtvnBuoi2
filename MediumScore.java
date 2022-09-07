import java.util.Scanner;

public class MediumScore {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter medium score:" );
        float mediumSocre = scanner.nextFloat();


        System.out.print("your classification is: ");
        while (mediumSocre <0 || mediumSocre >10){
            System.out.println("illegal ");
            System.out.println("re-enter medium score:" );
            mediumSocre = scanner.nextFloat();
        }
        if(8 <= mediumSocre && mediumSocre < 10){
            System.out.println("Good standing");
        }
        else if (6.5 <= mediumSocre && mediumSocre <8) {
            System.out.println("Academic pretty");
        }
        else if (5 < mediumSocre && mediumSocre <6.5) {
            System.out.println("Learning capacity is average");
        }
        else if (0 <= mediumSocre && mediumSocre <5) {
            System.out.println("Weak learning capacity");

        }


    }
}
