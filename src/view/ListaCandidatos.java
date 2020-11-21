package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import conrollerCandidato.ConsultaCandidatoController;

public class ListaCandidatos {
	public void MenuListaCandidato(String permissao) throws IOException {
		Menu voltar = new Menu();
		ConsultaCandidatoController Consulta = new ConsultaCandidatoController();
		int esc;
		esc = Integer.parseInt(JOptionPane.showInputDialog("Menu Candidato: \n"
				+ "1- Exibir lista de candidatos \n"
				+ "2- Consultar candidato pelo numero de inscrição \n"
				+ "9- voltar \n"));
		
		switch(esc) {
		case 1:
			
			break;
		case 2:
			Consulta.Consulta();
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Voltanto...");
			voltar.ViewMenu(permissao);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor Invalido!!!");	
			break;
		}
	}

}
