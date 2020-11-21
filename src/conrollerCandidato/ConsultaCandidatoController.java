package conrollerCandidato;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ConsultaCandidatoController {
	private BancoCandidato LerCand = new BancoCandidato();
	public StringBuffer bufferLer = new StringBuffer();
	public int NumeroConsulta;
	public StringBuffer buffer2 = new StringBuffer();
	private String NumConsulta;

	public void Consulta() throws IOException {
		LerCand.LerNumInscrissao(buffer2);
		boolean Valido = false;
		do {
			NumeroConsulta = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de inscrição do candidato que deseja consultar:"));
			NumConsulta = Integer.toString(NumeroConsulta);
			if(buffer2.equals(NumConsulta)) {
				System.out.println("Carregando...");
				LerCandidato();
				mostra();
				Valido = true;
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
