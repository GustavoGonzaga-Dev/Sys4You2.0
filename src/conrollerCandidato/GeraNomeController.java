package conrollerCandidato;

public class GeraNomeController {

	public String Inicio(String NomeCandidato){
		String nome;
		String sobrenome;
		for(int i = 0; i < 5; i++) {
			nome = nomeAleatorio();
			sobrenome = sobrenomeAleatorio();
			NomeCandidato = nome+ " " + sobrenome;
		}
		return NomeCandidato;
	}

	public static String nomeAleatorio() {
		String consonants = "BCDFGHJKLMNPQRSTVWXZ";
		String vowels = "AEIOUY";
		String nome = "";
		if(Math.random()< 0.2){
			nome += vowels.charAt((int)(Math.random()*6));
			nome += consonants.charAt((int)(Math.random()*20));
			nome += vowels.charAt((int)(Math.random()*6));
			nome += consonants.charAt ((int)(Math.random()*20));
			nome += vowels.charAt((int)(Math.random()*6));
		}else{
			nome += consonants.charAt((int)(Math.random()*20));
			nome += vowels.charAt((int)(Math.random()*6));
			nome += consonants.charAt((int)(Math.random()*20));
			nome += vowels.charAt((int)(Math.random()*6));
		}
		return nome;
	}

	public static String sobrenomeAleatorio() {
		String consonants = "BCDFGHJKLMNPQRSTVWXZ";
		String vowels = "AEIOUY";
		String sobrenome = "";
		if(Math.random()< 0.2){
			sobrenome += vowels.charAt((int)(Math.random()*6));
			sobrenome += consonants.charAt((int)(Math.random()*20));
			sobrenome += vowels.charAt((int)(Math.random()*6));
			sobrenome += consonants.charAt ((int)(Math.random()*20));
			sobrenome += vowels.charAt((int)(Math.random()*6));
		}else{
			sobrenome += consonants.charAt((int)(Math.random()*20));
			sobrenome += vowels.charAt((int)(Math.random()*6));
			sobrenome += consonants.charAt((int)(Math.random()*20));
			sobrenome += vowels.charAt((int)(Math.random()*6));
		}
		return sobrenome;
	}
}