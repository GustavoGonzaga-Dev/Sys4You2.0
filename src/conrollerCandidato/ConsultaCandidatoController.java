package conrollerCandidato;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ConsultaCandidatoController {
	private BancoCandidato LerCand = new BancoCandidato();
	public StringBuffer bufferLer = new StringBuffer();
	public int NumeroConsulta;
	public String NumConsulta;
	public StringBuffer buffer2 = new StringBuffer();

	public void Consulta() throws IOException {
		String[] Vetor = new String[6];
		LerCand.LerNumInscrissao(Vetor);
		for(int g = 0; g< Vetor.length; g++) {
			System.out.println(Vetor[g]);
		}
		boolean Valido = false;
		do {
			NumeroConsulta = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de inscrição do candidato que deseja consultar:"));
			NumConsulta = Integer.toString(NumeroConsulta);
			for(int i =0; i< Vetor.length; i++) {
				if(NumConsulta.contentEquals(Vetor[i])) {
					System.out.println("Carregando...");
					LerCandidato();
					mostra();
					Valido = true;
				}
			}
		}while(Valido != true);
	}

	public StringBuffer LerCandidato() throws IOException {
		LerCand.LerTXTcandidato(NumeroConsulta, bufferLer);
		return null;
	}

	public void mostra() {
		JOptionPane.showMessageDialog(null, bufferLer);
	}
}
