package conrollerCandidato;



public class HashLinear {
	private Hash[] tab;//vetor tab
	private int TAM_MAX;
	AleatorioController a = new AleatorioController();
	public HashLinear(int tam) {
		tab = new Hash[tam];//instancia variavel hash
		TAM_MAX = tam;
		for(int i=0; i<tam; i++)   // inicializando
			tab[i] = new Hash(false);
	}

	private int funcaohash(int chave) {
		//int v = (int) chave;//convertendo o valor para inteiro
		int Hee = Math.abs(chave) % TAM_MAX ;
		return Hee;//pega o resto da divis�o de um valor pelo tamanho do vetor
		//se o valor n�o for igual a zero ele retorna um valor entre 1 e o tamanho maximo do vetor
		// � aqui que pode ocorrer a colis�o
	}

	public void insere(int NumeroInscrissao) {

		if (cheia()) { // Se tabela cheia, imprime aviso e sai da fun��o
			System.out.println("\n->ATENCAO Tabela cheia");
			return; // saida imediata da fun��o, nao executa os comandos abaixo
		}

		int pos = funcaohash(NumeroInscrissao); // CALCULA POSI�AO

		// INICIO ROTINA TRATAMENTO DE COLISAO
		if (tab[pos].ocupado==true) { // se ocorreu colisao

			if (NumeroInscrissao == tab[pos].NumeroInscrissao) { // se a chave ja existe
				a.aleatorio();
				//System.out.println("\n->ATENCAO Esse item ja foi cadastrado");
				//return; // saida imediata da fun��o
			}

			System.out.println("-> Ocorreu uma colisao na posicao " + pos);
			while (pos < TAM_MAX) {
				if (pos == TAM_MAX-1 ) pos = -1; // volta para o inicio da tabela
				pos++; // incremento mais um no indice
				if ( !tab[pos].ocupado ) // se a posi��o estiver livre
					break; // sai do loop com o indice na posicao correta (pos sem colis�o)
			}
		}
		// FIM ROTINA TRATAMENTO DE COLISAO

		tab[pos].NumeroInscrissao=NumeroInscrissao;
		tab[pos].ocupado = true;
		System.out.print("-> Inserido HASH[" + pos + "]");
	}

	/*public int busca(double chave) { // Recuperando um elemento
		int pos = funcaohash(chave);
		if (tab[pos].ocupado==true) {
			if (tab[pos].NumeroInscrissao == chave) // Se o campo esta ocupado e o nome e chave s�o iguais
				return pos; // saida imediata da fun��o

			// INICIO ROTINA TRATAMENTO DE COLISAO (se o item e chave nao sao iguais)
			int iniciobusca = pos;
			while (pos < TAM_MAX) { // percorre proximas posi��es do vetor
				if (pos == TAM_MAX-1) pos=-1; // volta para o inicio da tabela
				pos++; // incremento mais um no indice
				if (tab[pos].ocupado && tab[pos].NumeroInscrissao == chave) // se o campo esta ocupado e o item foi encontrado
					return pos; // saida imediata da fun��o
				if (pos == iniciobusca) return -1; // se percorreu tudo e nao encontrou
			}
			//FIM ROTINA TRATAMENTO DE COLISAO
		}
		return -1;
	}

	public void apaga(double chave) {
		int pos = busca(chave);
		if (pos != -1) {
			tab[pos].ocupado = false;
			System.out.print("-> Dado HASH[" + pos + "] apagado");
		}
		else System.out.print("Item nao encontrado");
	}*/

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
