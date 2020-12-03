package controller;

import java.io.IOException;

import javax.swing.JOptionPane;

import view.ListaCandidatos;
import view.Menu;
import view.Permissoes;
import view.Usuarios;

public class MenuController {
	Permissoes viewpermissoes = new Permissoes();
	Usuarios Us = new Usuarios();
	ListaCandidatos ListCand = new ListaCandidatos();
	Menu voltar = new Menu();

	public MenuController() {
		super();
	}

	public void menuSwitch1(int escolha, String permissao) throws IOException {
		switch (escolha) {
		case 1:
			viewpermissoes.ViewPermissoes(permissao);
			break;
		case 2:
			Us.ViewUsuarios(permissao);
			break;
		case 4:
			ListCand.MenuListaCandidato(permissao);
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Muito obrigado por ultilizar o Sys4You");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor invalido");
			break;
		}
	}

	public void menuSwitch2(int escolha, String permissao) throws IOException {
		switch (escolha) {
		case 1:
			ListCand.MenuListaCandidato(permissao);
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Muito obrigado por ultilizar o Sys4You");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor invalido");
			voltar.ViewMenu(permissao);
			break;
		}
	}

	public void menuSwitch3(int escolha, String permissao) throws IOException {
		switch (escolha) {
		case 1:
			ListCand.MenuListaCandidato(permissao);
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Muito obrigado por ultilizar o Sys4You");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor invalido");
			voltar.ViewMenu(permissao);
			break;
		}
	}

}
