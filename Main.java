import java.util.*;

public class Main {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no.");
        int num1= sc.nextInt();
        System.out.println("enter second no.");
        int num2= sc.nextInt();
        System.out.println("select  the opertor(+,-,*,/): ");
        char operation= sc.next().charAt(0);
        int result= 0;

        switch(operation){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                if(num2 !=0){
                    result=num1/num2;
                }
                else{
                    System.out.println("cannont be divided by zero");
                    return;
                }
            break;
            default:
                System.out.println("invalid syntax");
                return;
        }
        System.out.println("result" +result);
    }
}