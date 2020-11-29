package conrollerCandidato;

import java.io.IOException;

import javax.swing.JOptionPane;

import view.ListaCandidatos;

public class VisualizarCandidatos {
	private BancoCandidato LerCand = new BancoCandidato();
	public String[] Vetor = new String[10];
	public StringBuffer bufferLer = new StringBuffer();
	public ListaCandidatos lista = new ListaCandidatos();
	
	public void MenuLC(String permissao) throws IOException {
		LerCandidato();
				//ORDENAR AQUI ----->
		mostra(permissao);
	}
	
	public StringBuffer LerCandidato() throws IOException {
		LerCand.LerNumInscrissao(Vetor);
		for(int i = 0; i<Vetor.length; i++) {
			LerCand.LerTXTallCandidatos(Vetor, bufferLer, i);
			bufferLer.append(Vetor[i] + "\n");
		}
		return bufferLer;
	}
	
	public void mostra(String permissao) throws IOException {
		JOptionPane.showMessageDialog(null, bufferLer);
		lista.MenuListaCandidato(permissao);
	}
}