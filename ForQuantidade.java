import java.util.Scanner;

public class ForQuantidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade;
        System.out.print("Quantas unidades você quer: ");
        quantidade = scanner.nextInt();
        
        for (int i=0; i < quantidade; i++){
            System.out.print("Digite o numero: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Par");
            }else if (numero % 2 == 1) {
                System.out.println("Impar");
            }else{
                System.out.println("Erro dos sonhos");
            }
        }
    scanner.close();
    }
}
