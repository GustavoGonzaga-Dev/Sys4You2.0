package conrollerCandidato;

public class GeraNomeController {
	
	
	public void Inicio(String nomeCandidato){
		

		String vet[] = new String[5];
		String nome;
		String sobrenome;
		for(int i = 0; i < 5; i++) {
			nome = nomeAleatorio();
			sobrenome = sobrenomeAleatorio();
			vet[i]=("O nome é: " + nome + " " + sobrenome);
		}
		mostrar(vet);
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
	
	public static void mostrar(String[] v) {
		for(int i = 0; i < 5; i++) {
			System.out.println (v[i].toString());
		}
	}
}