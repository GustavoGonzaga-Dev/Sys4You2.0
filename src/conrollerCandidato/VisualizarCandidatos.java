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
	
	
	public void MenuLC(String permissao) throws IOException {
		bufferApresenta.append("    *NOME*        |*| |*|      *CURSO*     |*| |*|   *NUMERO DE INSCRIÇÃO* \n ===================================================== \n ");
		LerCandidato();
		ordenaArray(nome);
		for(int i = 0; i < nome.length; i++) {
		bufferApresenta.append(nome[i] + "\n");
		}
		mostra(permissao);
	}
	
	
	public String[] LerCandidato() throws IOException {
		LerCand.LerNumInscrissao(Vetor);
		for(int i = 0; i<Vetor.length; i++) {
			LerCand.LerTXTallCandidatos(Vetor, nome, i);
			nome[i] += (Vetor[i] );
		}
		return nome;
	}
	
	public void mostra(String permissao) throws IOException {
		JOptionPane.showMessageDialog(null, bufferApresenta);
		lista.MenuListaCandidato(permissao);
	}
	
	public static String[] ordenaArray(String[] arrayNomes){
		
		String aux = "";
		
		for (int i = 0; i < arrayNomes.length; i++) {
			
			for (int j = 0; j < arrayNomes.length; j++) {
				String nome1 = arrayNomes[i];
				String nome2 = arrayNomes[j];
				

				if(nome2.charAt(0) > nome1.charAt(0)){
					
					aux = nome1; 
					arrayNomes[i] = nome2;
					arrayNomes[j] = aux;
				
				
				}else if(nome2.charAt(0) == nome1.charAt(0)){
				
					if(nome2.charAt(1) > nome1.charAt(1)){
						aux = nome1;
						arrayNomes[i] = nome2;
						arrayNomes[j] = aux;
					}	
					
				}
			}
	
		}

		return arrayNomes;
	}
	
}