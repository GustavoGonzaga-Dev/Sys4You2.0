package conrollerCandidato;

import java.io.IOException;

public class HL {

	private H[] tab;
	private int TAM_MAX;
	private int[] vet = new int[5];
	private int NumeroInscrissao;
	private int j = 0;
	String cheio;
	AleatorioController a = new AleatorioController();
	BancoCandidato Banco = new BancoCandidato();
	StringBuffer buffer1 = new StringBuffer();

	public HL(int tam) throws IOException {
		tab = new H[tam];
		TAM_MAX = tam;
		for(int i=0; i<tam; i++) {
			tab[i] = new H(false);
		}
	}

	private int funcaohash(int chave) {
		int Posicao = Math.abs(chave) % TAM_MAX ;
		return Posicao;
	}

	public void insere(String[] vetor) throws IOException {
		NumeroInscrissao = a.aleatorio();
		String NumeroInscrissaoB;
		NumeroInscrissaoB = Integer.toString(NumeroInscrissao);
		for(int i =0; i<vet.length; i++) {
			if(NumeroInscrissao == vet[i] || NumeroInscrissaoB.contentEquals(vetor[i])) {
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
		tab[pos].NumeroInscrissao = NumeroInscrissao;
		tab[pos].ocupado = true;
		Banco.GravarTXTcandidato(NumeroInscrissao);
		System.out.print("-> Inserido HASH[" + pos + "] Numero da inscrição: (" +NumeroInscrissao+ ") \n");
		vet[j] = NumeroInscrissao;
		buffer1.append(vet[j] + "\n");
		j++;
		
		
	}

	public void imprime(StringBuffer buffer3) throws IOException {
		for (int i=0; i<TAM_MAX; i++) {
			if ( tab[i].ocupado==true ) {
				System.out.print("\nHash[" + i + "] = " + tab[i].NumeroInscrissao);
			}
		}
		
		buffer3.append(buffer1);
		cheio = buffer3.toString();
		Banco.GravarTXTnumInscrissao(cheio);
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
