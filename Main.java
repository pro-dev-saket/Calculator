import java.util.*;
class Main{
    public static void main() {
        System.out.println("Calculator. Enter Operands and then the operator(+ or - or *).");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st operand (integer): ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter second operand(integer): ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the operator (+,- ,*): ");
        char operator = scanner.next().charAt(0);

        scanner.close();

        if (operator=='+') {
            System.out.println(a+b);
        }else if (operator == '-'){
            System.out.println(a-b);
        }
        else if(operator == '*'){
            System.out.println(a*b);
        }
        else {
            System.out.println("Invalid input");
        }


    }
}