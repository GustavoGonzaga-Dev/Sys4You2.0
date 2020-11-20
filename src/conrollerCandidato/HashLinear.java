package conrollerCandidato;

public class HashLinear {
	
	private Hash[] tab;
	private int TAM_MAX;
	private int[] vet = new int[10];
	private int NumeroInscrissao;
	private int j = 0;
	AleatorioController a = new AleatorioController();

	public HashLinear(int tam) {
		tab = new Hash[tam];
		TAM_MAX = tam;
		for(int i=0; i<tam; i++) {
			tab[i] = new Hash(false);
		}
	}

	private int funcaohash(int chave) {
		int Posicao = Math.abs(chave) % TAM_MAX ;
		return Posicao;
	}

	public void insere() {
		NumeroInscrissao = a.aleatorio();
		for(int i =0; i<vet.length; i++) {
			if(NumeroInscrissao == vet[i]) {
				System.out.println("REPETIU A MERDA");
				NumeroInscrissao = a.aleatorio();
			}
		}
		if (cheia()) {
			System.out.println("\n->ATENCAO Tabela cheia");
			return;
		}
		int pos = funcaohash(NumeroInscrissao);
		if (tab[pos].ocupado==true) {
			System.out.println("-> Ocorreu uma colisao na posicao " + pos);
			while (pos < TAM_MAX) {
				if (pos == TAM_MAX-1 ) pos = -1;
				pos++;
				if ( !tab[pos].ocupado )
					break;
			}
		}
		tab[pos].NumeroInscrissao=NumeroInscrissao;
		tab[pos].ocupado = true;
		System.out.print("-> Inserido HASH[" + pos + "] Numero da inscrição: (" +NumeroInscrissao+ ") \n");
		vet[j] = NumeroInscrissao;
		j++;
	}

	public void imprime() {
		for (int i=0; i<TAM_MAX; i++)
			if ( tab[i].ocupado==true )
				System.out.print("\nHash[" + i + "] = " + tab[i].NumeroInscrissao);
	}

	public boolean cheia() {
		int i, qtde=0;
		for (i=0; i<TAM_MAX; i++)
			if( tab[i].ocupado==true ) {
				qtde++;
			}
		if (qtde == TAM_MAX) return true;
		return false;
	}
}
