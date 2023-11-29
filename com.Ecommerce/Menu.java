package com.ecommerce;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private boolean sair;
    
    public Menu() {
        this.scanner = new Scanner(System.in);
        this.sair = false;
    }

    public void executarMenu() {
        while (!sair) {
            exibirOpcoes();

            int escolha = obterEscolhaUsuario();

            processarEscolha(escolha);
        }
    }

    private void exibirOpcoes() {
        System.out.println("===== Menu Inicial =====");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Sair");
    }

    private int obterEscolhaUsuario() {
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha após a leitura do número
        return escolha;
    }

    private void processarEscolha(int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Opção 1 escolhida: Adicionar Produto");
                // Adicione aqui a lógica para adicionar um produto
                break;
            case 2:
                System.out.println("Opção 2 escolhida: Listar Produtos");
                // Adicione aqui a lógica para listar os produtos
                break;
            case 3:
                System.out.println("Opção 3 escolhida: Sair");
                sair = true;
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void sobre() {
		System.out.println("\n**********************************************");
		System.out.println("                                            ");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Matheus Souza - matheussouzak18@gmail.com");
		System.out.println("https://github.com/Teuz1");
		System.out.println("\n**********************************************");
		
	}

}
