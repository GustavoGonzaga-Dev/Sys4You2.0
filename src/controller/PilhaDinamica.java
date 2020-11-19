package controller;

public class PilhaDinamica {
	
		public No inicio;

		public PilhaDinamica() { // inicia a pilha Dinamica
			inicio = null;
		}

		public boolean vazia() { // verifica se esta vazia

			return inicio == null;
		}

		public void empilha(StringBuffer buffer) { //empilha itens

			No novo = new No(buffer);
			novo.prox = inicio;
			inicio = novo;
		}

		public Object desempilha() { //desempilha itens

			Object i = -1;

			if (vazia()) {
				System.out.println("ERRO! Lista v�zia");
			} else {
				i = inicio.Dado;
				inicio = inicio.prox;
			}

			return i;

		}

		public String percorre() { //percorre a pilha

			String r = "";

			if (vazia()) {
				System.out.println("Erro! Lista vazia");
			} else {

				No aux = inicio;

				while (aux != null) {
					r += "" + aux.Dado;
					aux = aux.prox;
				}
			}

			return r;
		}

	}

