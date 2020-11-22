package conrollerCandidato;

import java.io.IOException;

public class HashTableLinear {
	
	public void HashTable() throws IOException {
		HashLinear tab = new HashLinear(5);
		BancoCandidato Banco = new BancoCandidato();
		//StringBuffer buffer2 = new StringBuffer();
		String[] Vetor = new String[12];
		Banco.LerNumInscrissao(Vetor);
		StringBuffer buffer3 = new StringBuffer();
		for(int i =0; i< Vetor.length; i++) {
		buffer3.append(Vetor[i]);
		}
		for (int j = 0; j < 5; j++) {
			tab.insere(Vetor);
		}
		System.out.print("\n\nImprimindo conteudo");
		tab.imprime(buffer3);
	}
}
