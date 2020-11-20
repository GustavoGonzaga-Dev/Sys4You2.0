package conrollerCandidato;

import java.nio.Buffer;

public class PrincipalController {
	public void PrincipalC() {
		AleatorioController a = new AleatorioController();
		HashTableLinear h = new HashTableLinear();
		int NumeroInscrissao;
		for(int i =0; i<10; i++) {
			NumeroInscrissao = a.aleatorio();
			h.HashTable(NumeroInscrissao);
			
		}
		
	}

}
