package conrollerCandidato;

import java.util.Random;

import javax.swing.JOptionPane;

public class AleatorioController {

	public int aleatorio() {
		//int[] vet = new int[10];
		Random r = new Random();
		int n;
		n = r.nextInt(500) + 1;
		//if(compara(vet, n) == true) {
		//aleatorio();
		//}
		//add(vet, n);
		//JOptionPane.showMessageDialog(null, n);
		return n;
	}

	public void add(int[] vet, int n) {
		

	}

	public boolean compara(int[] vet, int n) {
		if(vazio(vet) == false) {
			for(int i=0; i< vet.length; i++) {
				if(vet[i] == n) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean vazio(int[] vet) {
		int i = 0;
		if( vet[i] == 0) {
			return true;
		}
		return false;
	}
}
