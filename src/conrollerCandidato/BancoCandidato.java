package conrollerCandidato;

import java.io.BufferedReader;
import java.io.FileReader;
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
	
	public void GravarTXTnumInscrissao(String cheio ) throws IOException {
		FileWriter Arq = new FileWriter("NumerosDeInscrissao.txt");
		PrintWriter GravArq = new PrintWriter(Arq);
		GravArq.printf(cheio + "\n");
		Arq.close();
	}
	
	public StringBuffer LerNumInscrissao(StringBuffer buffer2) throws IOException {
		BufferedReader ler = new BufferedReader(new FileReader("NumerosDeInscrissao.txt"));
		String line =ler.readLine();
		while(line!=null) {
			buffer2.append(line + "\n");
			line = ler.readLine();
		}
		ler.close();
		return buffer2;
	}
}
