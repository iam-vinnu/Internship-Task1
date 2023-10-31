
import java.util.Scanner;

public class CalculatorTask1 {

    public static int Add(int a , int b){
         return a+b;
    }
    public static int Sub(int a , int b){
        return a-b;
    }
    public static int Multi(int a , int b){
          return a*b;
    }
    public static int Div(int a , int b){
         return a/b;
    }

    public static void main(String[] args) {
        Scanner ob1 = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int Num1 = ob1.nextInt();
        int Num2 = ob1.nextInt();

        System.out.println("Choose the Operation (+ , - , * , /)");
        char op = ob1.next().charAt(0);
        switch (op){
            case '+':
                System.out.println(Add(Num1,Num2));;
            break;
            case '-':
                System.out.println(Sub(Num1,Num2)); ;
            break;
            case '*':
                System.out.println(Multi(Num1,Num2));;
            break;
            case '/':
                System.out.println(Div(Num1,Num2));;
            break;
        }

    }
}
