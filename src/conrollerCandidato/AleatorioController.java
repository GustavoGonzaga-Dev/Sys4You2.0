package conrollerCandidato;

import java.util.Random;

public class AleatorioController {
	public int aleatorio() {
		Random r = new Random();
		int n;
		n = r.nextInt(20) + 1;
		return n;
	}
}
