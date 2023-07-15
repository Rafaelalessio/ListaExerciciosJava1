import java.util.Scanner;

public class Exercicio6 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        int somaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        if (numero == somaDivisores) {
            System.out.println("Numero é um numero perfeito");
        } else {
            System.out.println("Numero não é um numero perfeito ");
        }
    }
}