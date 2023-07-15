import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        Set<Integer> numerosCalculados = new HashSet<>();
        numerosCalculados.add(numero);
        while (numero != 1) {
            int proximoNumero = 0;
            while (numero != 0) {
                int digito = numero % 10;
                proximoNumero += digito * digito;
                numero /= 10;
            }
            if (numerosCalculados.contains(proximoNumero)) {
                System.out.println("O número não é feliz.");
                return;
            }
            numerosCalculados.add(proximoNumero);
            numero = proximoNumero;
        }
        System.out.println("O número é feliz.");
    }
}

