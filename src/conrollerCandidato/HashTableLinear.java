package conrollerCandidato;

public class HashTableLinear {
	
	public void HashTable() {
		HashLinear tab = new HashLinear(10);
		for (int i = 0; i < 10; i++) {
			tab.insere();
		}
		System.out.print("\n\nImprimindo conteudo");
		tab.imprime();
	}
}
