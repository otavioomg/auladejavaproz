import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetidor = 1;
        while (repetidor == 1) {
            System.out.print("Digite o numero: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Par");
            }else if (numero % 2 == 1) {
                System.out.println("Impar");
            }else{
                System.out.println("Erro dos sonhos");
            }

            System.out.print("Deseja continuar? (1. Sim / 2. Não): ");
            repetidor = scanner.nextInt();
        }
        scanner.close();
        }
}

