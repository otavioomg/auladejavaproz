import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetidor = 1;
        while (repetidor == 1) {
            System.out.print("Digite o numero: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println(numero + " é um número positivo");
            } else if (numero < 0) {
                System.out.println(numero + " é um número negativo");
            } else {
                System.out.println("Não foi possível");
            }

            // Pergunta se deseja continuar
            System.out.print("Deseja continuar? (1. Sim / 2. Não): ");
            repetidor = scanner.nextInt();
        }
        scanner.close();
    }
}