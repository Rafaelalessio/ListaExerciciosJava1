import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int numeroOriginal = numero;
        int digitos = String.valueOf(numero).length();
        int somaCubos = 0;
            while (numero != 0) {
                int digito = numero % 10;
                somaCubos += Math.pow(digito, digitos);
                numero /= 10;
            }
            if (somaCubos == numeroOriginal) {
                System.out.println(numeroOriginal + " é um número Armstrong.");
            } else {
                System.out.println(numeroOriginal + " não é um número Armstrong.");
            }
        }
}


