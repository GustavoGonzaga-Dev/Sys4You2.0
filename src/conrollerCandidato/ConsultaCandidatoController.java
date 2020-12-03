package conrollerCandidato;

import java.io.IOException;

import javax.swing.JOptionPane;

import view.ListaCandidatos;

public class ConsultaCandidatoController {
	private BancoCandidato LerCand = new BancoCandidato();
	public StringBuffer bufferLer = new StringBuffer();
	public int NumeroConsulta;
	public String NumConsulta;
	public StringBuffer buffer2 = new StringBuffer();
	public ListaCandidatos lista = new ListaCandidatos();
	public static int vetor2[] = new int[10];

	public void Consulta(String permissao) throws IOException {
		String[] Vetor = new String[10];
		OrdenarCand(Vetor);
		boolean Valido = false;
		do {
			NumeroConsulta = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de inscrição do candidato que deseja consultar:"));
			for (int i = 0; i < vetor2.length; i++) {
				if(NumeroConsulta == vetor2[i]) {
					System.out.println("Carregando...");
					LerCandidato();
					mostra();
					Valido = true;
				}
			}
		} while (Valido != true);
		lista.MenuListaCandidato(permissao);

	}

	public StringBuffer LerCandidato() throws IOException {
		LerCand.LerTXTcandidato(NumeroConsulta, bufferLer);
		return bufferLer;
	}

	public void mostra() {
		JOptionPane.showMessageDialog(null, bufferLer);
	}

	public int[] OrdenarCand(String[] Vetor) throws IOException {
		LerCand.LerNumInscrissao(Vetor);
		for (int i = 0; i < Vetor.length; i++) {
			vetor2[i] = Integer.parseInt(Vetor[i]);
		}
		QuickSort(vetor2, 0, vetor2.length - 1);
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("\n" + vetor2[i]);
		}
		return vetor2;
	}

	public static void QuickSort(int Vetor2[], int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		int pivo = vetor2[(esq + dir) / 2];
		int troca;
		while (esq <= dir) {
			while (vetor2[esq] < pivo) {
				esq = esq + 1;
			}
			while (vetor2[dir] > pivo) {
				dir = dir - 1;
			}
			if (esq <= dir) {
				troca = vetor2[esq];
				vetor2[esq] = vetor2[dir];
				vetor2[dir] = troca;
				esq = esq + 1;
				dir = dir - 1;
			}
		}
		if (dir > esquerda) 
			QuickSort(vetor2, esquerda, dir);
		if(esq < direita) 
			QuickSort(vetor2, esq, direita);
	}
}