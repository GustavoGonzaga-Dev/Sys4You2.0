package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.ControllerTXT;


public class Login {

	public void viewLogin() throws IOException {
		Menu menu = new Menu();
		ControllerTXT controlTxT = new ControllerTXT();
		String login;
		String senha;
		String Permissao;
		login = JOptionPane.showInputDialog("Insira o seu login: ");
		senha = JOptionPane.showInputDialog("Insira o sua senha: ");
		Permissao = controlTxT.ValidarLoginSenhaTXT(login, senha);
		if(Permissao != null && Permissao !="0") {
			menu.ViewMenu(Permissao);
		}else {
			JOptionPane.showMessageDialog(null, "login ou senha incorretos, permissão negada!");
		}
	}
}
