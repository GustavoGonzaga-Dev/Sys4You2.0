package conrollerCandidato;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BancoCandidato {
	String NomeArq;
	String NomeCurso;
	String NomeCandidato;
	CursosController curso = new CursosController();
	GeraNomeController geraNome = new GeraNomeController();
	
	public void GravarTXTcandidato(int NumeroInscrissao) throws IOException {
		NomeArq = Integer.toString(NumeroInscrissao);
		NomeCurso = curso.Cursos(NomeCurso);
		NomeCandidato = geraNome.Inicio(NomeCandidato);
		FileWriter Arq = new FileWriter(NomeArq + ".txt");
		PrintWriter GravArq = new PrintWriter(Arq);
		GravArq.printf(NomeCandidato +"\n" + NomeCurso);
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
	
	public StringBuffer LerTXTcandidato(int NumeroConsulta, StringBuffer bufferLer) throws IOException {
		NomeArq = Integer.toString(NumeroConsulta);
		BufferedReader ler = new BufferedReader(new FileReader(NomeArq+".txt"));
		String line =ler.readLine();
		while(line!=null) {
			bufferLer.append(line + "\n");
			line = ler.readLine();
		}
		ler.close();
		return bufferLer;
	}
}
