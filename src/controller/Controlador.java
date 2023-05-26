package controller;

import model.Lista;

public class Controlador {

	Lista[] tabelaEspalhamento;

	public Controlador(int qtd) {
		tabelaEspalhamento = new Lista[qtd];

		for (int i = 0; i < qtd; i++) {
			tabelaEspalhamento[i] = new Lista();
		}
	}

	public void cadastrar(int num) {
		int hash = hashCode(num);
		Lista l = tabelaEspalhamento[hash];
		l.addFirst(num);

	}

	public void listar(int qtd) throws Exception {
		Lista l = tabelaEspalhamento[qtd - 2];
		int tamanho = l.size();
		System.out.println("Listagem de pares: ");
		if (l.size() == 0) {
			System.out.println("Nenhum número aqui!!");
		} else {
			for (int i = 0; i < tamanho; i++) {
				System.out.println(l.get(i));
			}
		}
		l = tabelaEspalhamento[qtd - 1];
		tamanho = l.size();
		System.out.println("Listagem de ímpares: ");
		if (l.size() == 0) {
			System.out.println("Nenhum número aqui!!");
		} else {
			for (int i = 0; i < tamanho; i++) {
				System.out.println(l.get(i));
			}
		}

	}

	private int hashCode(int num) {
		return (num % 2);
	}
}
