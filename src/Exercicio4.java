import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero positivo: ");
        int numero = scanner.nextInt();
        if (numero <= 0) {
           System.out.println("O numero tem que ser positivo");
           return;
        }
        int soma = 0;
        for (int i=1; i<= numero; i++) {
           soma += i;
        }
        System.out.println("A soma dos números inteiros positivos até " + numero + " é: " + soma);
    }


}
