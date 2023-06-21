package Bichinhovirtual;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do animal: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a classe do animal: ");
        String classe = scanner.nextLine();

        System.out.print("Digite a família do animal: ");
        String familia = scanner.nextLine();

        Animal animal = new Animal(nome, classe, familia);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nOpções:");
            System.out.println("1 - Comer");
            System.out.println("2 - Correr");
            System.out.println("3 - Dormir");
            System.out.println("4 - Sair do programa");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    animal.comer();
                    break;
                case 2:
                    animal.correr();
                    break;
                case 3:
                    animal.dormir();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite um número de 1 a 4.");
                    break;
            }
        }

        scanner.close();
    }
}

