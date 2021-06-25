import java.util.Scanner;

public class Practice {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        welcome();
        System.out.println("================");
        menu();

    }

     static void welcome(){
         System.out.println(" Welcome to Calculator");
    }

    static void menu() {
        System.out.println("1 for Add");
        System.out.println("2 for Subtract");
        System.out.println("3 for Multiply");
        System.out.println("4 for Divide");
        System.out.println("0 for Exit");
        int selectedOption = scanner.nextInt();
        if(selectedOption == 0){
            System.out.println(" Thanks for Coming ");
            return;
        }

        int val1;
        int val2;
        int[] inputs = takeInput();
        val1 = inputs[0];
        val2 = inputs[1];

        System.out.println("Your result: ");

        switch (selectedOption){
            case 1:
                printAnswer("+",val1,val2,val1+val2);
                break;
            case 2:
                printAnswer("-",val1,val2,val1-val2);
                break;
            case 3:
                printAnswer("*",val1,val2,val1*val2);
                break;
            case 4:
                printAnswer("/",val1,val2,val1/val2);
                break;
            default:
                System.out.println(" Please read again!! ");
        }

        System.out.println("=============");
        menu();
    }

    public static int[] takeInput(){
        System.out.print("Enter first value : ");
        int val1 = scanner.nextInt();
        System.out.print("Enter second value : ");
        int val2 = scanner.nextInt();
        int[] myValues = {val1,val2};
        return myValues;
    }

    public static void printAnswer(String operator,int val1,int val2,int ans){
        System.out.print(val1 + " "+operator+" " + val2 + " = ");
        System.out.println(ans);
    }
}
