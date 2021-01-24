import java.util.Scanner;

public class Java {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String NameInput = inputScanner.nextLine();
        System.out.println("Welcome " + NameInput+"!!");

        System.out.print("Enter first value : ");
        float val1 = inputScanner.nextFloat();

        System.out.print("Enter second value : ");
        float val2 = inputScanner.nextFloat();

        System.out.println("Your result: ");

        System.out.print(val1+" + "+val2+" = ");
        System.out.println(val1 + val2);

        System.out.print(val1+" - "+val2+" = ");
        System.out.println(val1 - val2);

        System.out.print(val1+" * "+val2+" = ");
        System.out.println(val1 * val2);

        System.out.print(val1+" / "+val2+" = ");
        System.out.println(val1 / val2);

    }


}

