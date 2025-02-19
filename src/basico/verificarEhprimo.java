/*Ex03.	Criar um código que verifica se um número inteiro é primo.*/
package basico;

public class verificarEhprimo {
    public static void main(String[] args) {
        int verificar = 28;

        if (ehprimo(verificar)) {
            System.out.println(verificar + " é primo");
        } else {
            System.out.println(verificar + " Não é primo");
        }

    }

    public static boolean ehprimo(int verificar) {
        if (verificar < 2) {
            return false;
        }
        if (verificar == 2 || verificar == 3) {
            return true;
        }
        if (verificar % 2 == 0) {
            return false;
        }

        for (int i = 3; i < verificar; i++) {
            if (verificar % i == 0) {
                return false;
            }
        }
        return true;
    }
}
