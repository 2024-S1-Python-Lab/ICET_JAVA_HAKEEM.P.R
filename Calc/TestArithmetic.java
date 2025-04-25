import arithmetic.*;
import java.util.Scanner;
public class TestArithmetic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        double num1=sc.nextDouble();
        System.out.println("Enter the 2nd number:");
        double num2=sc.nextDouble();
        Addition addObj=new Addition(num1,num2);
        Substract subObj=new Substract(num1,num2);
        Multiply mulObj=new Multiply(num1,num2);
        Divide divObj=new Divide(num1,num2);
        System.out.println("Addition: "+addObj.add());
        System.out.println("Substraction: "+subObj.sub());
        System.out.println("Multiplication: "+mulObj.multi());
        System.out.println("Division: "+divObj.div());
    }
}