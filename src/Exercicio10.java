import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        int resultado = random.nextInt(6) + 1;
        System.out.println("O dado foi lançado e o resultado é: " + resultado);
    }

}
