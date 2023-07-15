import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Numero: ");
        int numero = scanner.nextInt();
        if (numero > 1) {
            boolean primo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println("O numero é primo");
            } else {
                System.out.println("O numero não é primo");
            }
        } else {
            System.out.println("O numero não é primo");
        }
    }
}
