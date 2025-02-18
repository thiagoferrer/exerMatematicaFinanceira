/*Ex01.	Criar um programa que recebe dois números inteiros e imprime sua soma, subtração, multiplicação e divisão.*/
package basico;

public class doisNumerosInteiros {
    public static void main(String[] args) {
        double a = 7;
        double b = 5;

        System.out.println("Resultado da soma é: " + somaDoisNumerosInteiros(7, 5));
        System.out.println("Resultado da subtração é: " + subtracaoDoisNumerosInteiros(7, 5));
        System.out.println("Resultado da multiplicação é: " + multiplicacaoDoisNumerosInteiros(a, b));
        System.out.println("Resultado da divisão é: " + divisaoDoisNumerosInteiros(7, 5));
    }

    public static int somaDoisNumerosInteiros(int a, int b) {
        return a + b;
    }

    public static int subtracaoDoisNumerosInteiros(int a, int b) {
        return a - b;
    }

    public static double multiplicacaoDoisNumerosInteiros(double a, double b) {
        return a * b;
    }

    public static double divisaoDoisNumerosInteiros(int a, int b) {
        return a / b;
    }
}
