package conrollerCandidato;

import java.io.IOException;

public class HashTableLinear {
	
	public void HashTable() throws IOException {
		HashLinear tab = new HashLinear(5);
		BancoCandidato Banco = new BancoCandidato();
		StringBuffer buffer2 = new StringBuffer();
		Banco.LerNumInscrissao(buffer2);
		StringBuffer buffer3 = new StringBuffer();
		buffer3.append(buffer2);
		for (int i = 0; i < 5; i++) {
			tab.insere(buffer2);
		}
		System.out.print("\n\nImprimindo conteudo");
		tab.imprime(buffer3);
	}
}
