/*EX02.	Desenvolver um programa que solicita um número ao usuário e informa se ele é par ou ímpar.*/
package basico;

public class parImpar {
    public static void main(String[] args) {
        double num = 3;
        System.out.println("\nO Resultado é: " + parOuImpar(num));
    }

    public static double parOuImpar(double num) {
        if (num % 2 == 0) {
            System.out.println("\nO número é par");
        } else {
            System.out.println("\nO número é ímpar");
        }
        return num;
    }
}
