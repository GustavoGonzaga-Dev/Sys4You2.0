package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.ControllerTXT;
import controller.FilaDinamica;

public class Permissoes {
	public void ViewPermissoes(String permissao) throws IOException {
		ControllerTXT controlTxT = new ControllerTXT();
		FilaDinamica<String> fila = new FilaDinamica<String>();
		Menu voltar = new Menu();
		//fila.getFilaDinamica();
		int opc = 0;
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu permissões:\n"
					+ "1- Adicionar \n"
					+ "2- Remover ultimo item adicionado \n"
					+ "3- Mostrar Itens que serão adicionados \n"
					+ "4- Gravar no Banco \n"
					+ "5- Mostrar itens cadastrados no banco \n"
					+ "9- Sair \n"));
			switch(opc) {
			case 1: 
				String dado = JOptionPane.showInputDialog("Insira um cargo");
				fila.add(dado);
				break;
			case 2:
				System.out.println("O cargo " + fila.remove() + " foi removido");
				break;
			case 3: 
				System.out.println(fila.mostra());
				break;
			case 4:
				controlTxT.GravTXTPermissoes(fila.mostra());
				break;
			case 5:
				controlTxT.CarregarPilhaStatica();
				break;
			case 9: 
				System.out.println("Saindo");
				voltar.ViewMenu(permissao);
				break;
			default: System.err.println("Opc errada");
			}
		}
	}
}
