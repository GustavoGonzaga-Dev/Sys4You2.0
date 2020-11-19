package controller;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ControllerTXT {

	static Banco BancoModel = new Banco();
	String Vet[] = new String[6];
	static String nomeArq;

	public ControllerTXT() {
		super();
	}

	public void GravTXTLoginSenha(StringBuffer buffer) throws IOException {
		BancoModel.GravarLoginSenha(buffer);

	}

	public void GravTXTPermissoes(String string) throws IOException {
		BancoModel.GravarPermissoes(string);
	}

	public String ValidarLoginSenhaTXT(String login, String senha) throws IOException {
		nomeArq = "Login&Senha.txt";
		Vet = BancoModel.LerLog(Vet, nomeArq);
		int i = 0;
		String permissao = "0";
		do {
			if (Vet[i].equals(login)) {
				i++;
				if (Vet[i].equals(senha)) {
					permissao = Vet[i + 1];

				} else {
					i += 2;
				}
			} else {
				i += 3;
			}
		} while (i < Vet.length && permissao == "0");
		return permissao;
	}

	public PilhaEstatica CarregarPilhaStatica() throws IOException {
		nomeArq = "Permissoes.txt";
		PilhaEstatica p = new PilhaEstatica();
		p =  BancoModel.LerPerm(nomeArq, p);
		p.mostrar();
		return p;
	}

	public static void CarregarFilaStatica(StringBuffer buffer) throws IOException {
		nomeArq = "Login&Senha.txt";
		FilaEstatica fila = new FilaEstatica();
		buffer = BancoModel.LerCarregaLog(buffer, nomeArq);
		fila.insere(buffer);		
		JOptionPane.showMessageDialog(null, fila.retira());
	}
}
