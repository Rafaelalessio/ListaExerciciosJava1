import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero: ");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo numero: ");
            int numero2 = scanner.nextInt();

            System.out.println("Digite o terceiro numero: ");
            int numero3 = scanner.nextInt();

            int maior = Math.max(Math.max(numero1, numero2), numero3);
            int menor = Math.min(Math.min(numero1, numero2), numero3);

            System.out.println("O maior numero: " + maior);
            System.out.println("O menor numero e " + menor);
        }
    }
}
