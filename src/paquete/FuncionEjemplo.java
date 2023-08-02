package paquete;

import java.util.Scanner;

public class FuncionEjemplo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("valor de a: ");
        int a = sc.nextInt();
        System.out.print("valor de b: ");
        int b = sc.nextInt();
        int result = (int) Math.pow(a + b, 2) * (a + b);
        System.out.println("(a+b)^2(a+b) = " + result);
    }
}
