package controller;
	
public class FilaEstatica {
	
	private Object [] objetos = new Object[6];
	private int primeiro;
	private int ultimo;
	private int total;
	
	public FilaEstatica() {
		primeiro = 0;
		ultimo = 0;
		total = 0;
	}
	
	public void insere(StringBuffer buffer) {
		if (isFull()) {
			throw new RuntimeException("Fila Cheia! N�o da pra inserir mais nada!");
		}
		objetos[ultimo] = buffer;
		ultimo = (ultimo +1) % objetos.length;
		total++;
	}
	
	public Object retira() {
		if(isEmpty()) {
			throw new RuntimeException("Fila Vazia! nada para ser retirado!");
		}
		Object elemento;
		elemento = objetos[primeiro];
		primeiro = (primeiro +1) % objetos.length;
		total--;
		return elemento;
	}
	
	public boolean isEmpty() {
		return total==0; // se o resultado do teste vai dar true or false
	}
	
	public boolean isFull() {
		return total == objetos.length ;
//		if (true) {
//			int[] variavel = new int[n];
//		}
	}
//	
//	private void garantaEspaco() {
//        if (totalDeObjetos == objetos.length) {
//            Object[] novoVetor = new Object[objetos.length * 2];
//            for (int i = 0; i < objetos.length; i++) {
//                novoVetor[i] = objetos[i];
//            }
//            objetos = novoVetor;
//        }
}	