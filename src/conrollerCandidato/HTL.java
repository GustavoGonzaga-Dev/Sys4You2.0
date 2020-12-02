package conrollerCandidato;

import java.io.IOException;

public class HTL {	//Hash Table Linear
	
	public void HashTable() throws IOException {
		HL tab = new HL(5);
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
