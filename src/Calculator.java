import java.util.Scanner;

public class Calculator {


    static int first, second;
    static char sign;

    //Main method
    public static void main(String[] args) {
        //create scanner objects
        Scanner scanner = new Scanner(System.in);
        //User will enter Two numbers
        System.out.println("Enter 1st number  : ");
        //user will enter the number
        first = scanner.nextInt();
        System.out.println("Enter 2nd number ");
        second = scanner.nextInt();
        System.out.println("Enter an operand to calculate");
        sign = scanner.next().charAt(0);

        int add = first + second;
        int subtract = first - second;
        int multiplication = first * second;
        float devide = (float) first / second;
        //condition applied
        if (sign == '+') {
            System.out.println("Answer = " + add);     //addition
        } else if (sign == '-') {
            System.out.println("Answer = " + subtract);   //subtraction
        }
        else if(sign=='*'){
            System.out.println("Answer = " + multiplication);    //multiplication
        }
        else if(sign=='/'){
            System.out.println("answer = " + devide);          //devidation
        }
        else{
            System.out.println("Nothing found");
        }
    }
}
