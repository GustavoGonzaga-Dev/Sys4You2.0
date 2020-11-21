package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import conrollerCandidato.PrincipalController;

public class Principal {

	public static void main(String[] args) throws IOException { //o sistema começa aqui :3
		PrincipalController a = new PrincipalController();
		Login log = new Login();
		int esc;
		esc = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo sua delicia :3\n"
				+ "1- Secretaria \n"
				+ "2- Candidatos \n"
				+ "0- Sair \n"));
		
		switch(esc) {
		case 1:
			log.viewLogin();
			break;
		case 2:
			a.PrincipalC();
			break;
		case 0:
			JOptionPane.showMessageDialog(null, "Até mais sua delicia :3");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor Invalido!!!");	
			break;
		}
	}

}
