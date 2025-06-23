import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Qual é o seu nome: ");
        String nome = scanner.next();
        
        if (idade < 12){
            System.out.println(nome+ ", Você tem " +idade+ ",você é uma criança.");
        }
        else if (idade < 18){
            System.out.println(nome+ ", Você tem " +idade+ ",você é um adolescente.");
        }
        else if (idade < 60){
            System.out.println(nome+ ", Você tem " +idade+ ",você é um adulto.");
        }
        else {
            System.out.println(nome+ ", Você tem " +idade+ ",você é um idoso.");
        }

        scanner.close();
    }
}
