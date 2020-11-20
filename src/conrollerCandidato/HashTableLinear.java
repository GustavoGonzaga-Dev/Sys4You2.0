package conrollerCandidato;


import java.util.Scanner;

public class HashTableLinear {
	public void HashTable(int n) {
		HashLinear tab = new HashLinear(10);
		int NumeroInscrissao;

		for (int i = 0; i < 10; i++) {
			NumeroInscrissao = n; //numero aleatorio
			tab.insere(NumeroInscrissao);// � o vetor da estrutura da hash
		}
		System.out.print("\n\nImprimindo conteudo");
		tab.imprime();

		/*System.out.print("\n\nBuscando campo\n>>> Forneca o item: ");
		NumeroInscrissao = le.nextDouble();
		if (tab.busca(NumeroInscrissao) != -1)
			System.out.print("Item encontrado na posicao " + tab.busca(NumeroInscrissao));
		else
			System.out.print("Item nao encontrado");

		System.out.print("\n\nApagando campo\n>>> Forneca o item: ");
		NumeroInscrissao = le.nextDouble();
		tab.apaga(NumeroInscrissao);

		System.out.print("\n\nImprimindo conteudo");
		tab.imprime();

		System.out.println("\n");*/
	}

}
