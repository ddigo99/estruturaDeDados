package atividadepilha;

import java.util.Scanner;
import java.util.Stack;

public class PilhaLivros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Stack<String> livros = new Stack<String>();
		String leiaUsuario = "";

		while (!leiaUsuario.equals("0")) {
			System.out.println("::::::::::::::::::::::::::::");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("******************************");
			System.out.print("Entre com a opção desejada: ");
			leiaUsuario = leia.nextLine();

			switch (leiaUsuario) {
			case "0":
				System.err.println("Programa finalizado!");
				break;
			case "1":
				System.out.print("Digite o nome: ");
				livros.push(leia.nextLine());
				System.out.println();

				System.out.println("Pilha:");
				for (String name : livros) {
					System.out.println("* " + name);
				}
				System.out.println("Livro adicionado!");

				break;
			case "2":
				if (livros.size() == 0) {
					System.err.println("A pilha está vazia!");
				} else {
					System.out.println("\nLista de livros na pilha:");
					for (String name : livros) {
						System.out.println("* " + name);
					}
				}
				break;
			case "3":
				if (livros.size() == 0) {
					System.err.println("A pilha está vazia!");
				} else {
					livros.pop();
					System.out.println("\nPilha:");
					for (String name : livros) {
						System.out.println("* " + name);
					}
					System.out.println("Um livro foi retirado da pilha!");
				}
				break;
			default:
				System.err.println("Opção inválida!");
			}
			System.out.println();
		}
		leia.close();

	}

}
