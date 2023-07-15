import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String texto = scanner.nextLine();
        String reverso ="";
        for ( int i = texto.length()-1; i >=0; i--) {
            reverso += texto.charAt(i);

        }
        if ( texto.equalsIgnoreCase(reverso)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

}

}
