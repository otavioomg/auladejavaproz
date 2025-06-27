import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade;

        System.out.print("Digite quantas pessoas deseja cadastrar: ");
        quantidade = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o peso da pessoa: ");
             double peso = scanner.nextDouble();

            System.out.print("Digite a altura da pessoa: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            double imc = peso / (altura * altura);
            System.out.printf("IMC de %s: %.2f\n", nome, imc);   

            if (imc < 18.5) {
                System.out.println("A pessoa está abaixo do peso.");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("A pessoa está em um peso normal.");
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("A pessoa está em um sobrepeso.");
            } else if (imc >= 30.0) {
                System.out.println("A pessoa está obesa.");
            } else {
                System.out.println("Erro.");
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();

       
    }
}
