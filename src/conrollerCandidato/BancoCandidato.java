package conrollerCandidato;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BancoCandidato {
	String NomeArq;
	String NomeCurso;
	CursosController curso = new CursosController();
	
	public void GravarTXTcandidato(int NumeroInscrissao) throws IOException {
		NomeArq = Integer.toString(NumeroInscrissao);
		NomeCurso = curso.Cursos(NomeCurso);
		FileWriter Arq = new FileWriter(NomeArq + ".txt");
		PrintWriter GravArq = new PrintWriter(Arq);
		GravArq.printf("Candidato \n" + NomeCurso);
		Arq.close();
	}
}
