import java.util.Scanner;

public class Exercicio7 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos da sequência Fibonacci");
        int quantidade = scanner.nextInt();
        int primeiroNumero = 0;
        int segundoNumero = 1;
        for (int i = 0; i < quantidade; i++) {
            int proximonumero = primeiroNumero + segundoNumero;
            System.out.println(proximonumero);
            primeiroNumero = segundoNumero;
            segundoNumero = proximonumero;
        }
    }
}
