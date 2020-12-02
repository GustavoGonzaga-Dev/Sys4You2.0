package conrollerCandidato;

import java.io.IOException;

import javax.swing.JOptionPane;

import view.ListaCandidatos;

public class VisualizarCandidatos {
	private BancoCandidato LerCand = new BancoCandidato();
	public String[] Vetor = new String[10];
	public StringBuffer bufferApresenta = new StringBuffer();
	public String [] nome = new String [10];
	public ListaCandidatos lista = new ListaCandidatos();
	public Heap hp = new Heap();

	public void MenuLC(String permissao) throws IOException {
		LerCandidato();
		int n = nome.length;
		Heap.inicio(nome, n, permissao);
	}

	public String[] LerCandidato() throws IOException {
		LerCand.LerNumInscrissao(Vetor);
		for(int i = 0; i<Vetor.length; i++) {
			LerCand.LerTXTallCandidatos(Vetor, nome, i);
			nome[i] += (Vetor[i] );
		}
		return nome;
	}
}