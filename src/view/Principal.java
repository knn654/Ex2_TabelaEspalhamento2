package view;

import controller.Controlador;

public class Principal {

	public static void main(String[] args) throws Exception {
		Controlador tabela = new Controlador(2);

		int[] vetor = new int[10];
		System.out.println("Números: ");
		for (int i = 0; i < 10; i++) {
			vetor[i] = (int) ((Math.random() * 100) + 1);
			System.out.print(vetor[i] + " ");
			tabela.cadastrar(vetor[i]);
		}
		System.out.println(" ");
		tabela.listar(2);

	}
}
