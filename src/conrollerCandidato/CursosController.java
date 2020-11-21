package conrollerCandidato;

import java.io.IOException;
import java.util.Random;

public class CursosController {
	
	public String Cursos(String NomeCurso)throws IOException {
		int n =0;
		String[] VetCursos = new String[3];
		VetCursos[0] = "Informatica";
		VetCursos[1] = "Logistica";
		VetCursos[2] = "Gestão";
		for(int i = 0; i<10; i++) 
			n = randomCurso();
			switch (n) {
			case 0:
				NomeCurso = VetCursos[0];
				break;
			case 1:
				NomeCurso = VetCursos[1];
				break;
			case 2:
				NomeCurso = VetCursos[2];
				break;
			default:
				System.out.println("deu ruim aqui");
				break;
			}
			return NomeCurso;
	}

	public int randomCurso() {
		Random r = new Random();
		int n;
		n = r.nextInt(3);
		return n;
	}

}
