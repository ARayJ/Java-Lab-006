/**
 * Identifies an instance variable
 *
 * @param n and m are declared the value of the instance variables
 *
 * @returns true if instance variables are divisible, and False otherwise.
 */

/**
 *
 *@authorTrevorHartman
 *@authorAaronJohnson
 *
 *@sinceVersion1.0
 */

import java.util.Scanner;
public class Lab006 {
    public int n;
    public int m;

    public Lab006(int n, int m){
        this.n = n;
        this.m = m;
    }

    public String isDivisible(int n, int m) {
        if (n % m == 0) {
            System.out.print("True!");
            return "True";
        } else {
            System.out.print("False!");
            return "False";
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int i1 = scanner.nextInt();
        System.out.println("Please enter another integer: ");
        int i2 = scanner.nextInt();
        Lab006 Obj1 = new Lab006(i1, i2);
        System.out.printf("Is %d divisible by %d? ", i1, i2);
        Obj1.isDivisible(i1,i2);
    }

}

