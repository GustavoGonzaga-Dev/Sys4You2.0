package conrollerCandidato;

import java.util.Arrays;

public class VisualizarCandidatos {
			//tem que arrumar esse
	public static void MenuLC() {
		String[] NomeCandidatos = new String[10];
		for (int i = 0; i < NomeCandidatos.length; i++) {
			NomeCandidatos[i] = GeraNomeController.nomeAleatorio();
		}
		Arrays.sort(NomeCandidatos);
		for (int i = 0; i < NomeCandidatos.length; i++) {
			System.out.println(NomeCandidatos[i]);
		}
	}
}