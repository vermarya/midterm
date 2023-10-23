/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic {

    public static void main(String[] args) {
       
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number:");
        double n = in.nextDouble();

        System.out.println("Enter second number:");
        double m = in.nextDouble();

        System.out.println("Choose an arithmetic operation: ");
        for (ArithmeticBase.Operation op : ArithmeticBase.Operation.values()) {
            System.out.println(op.ordinal() + ". " + op);
        }

        int choice = in.nextInt();

        double result = r.calculate(m, n, ArithmeticBase.Operation.values()[choice]);
        System.out.println("Result: " + result);
    }
}

