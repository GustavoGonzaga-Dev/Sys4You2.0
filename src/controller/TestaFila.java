package controller;

public class TestaFila {

	public static void main(String[] args) {
		FilaEstatica fila = new FilaEstatica();
//		fila.insere(1);
//		fila.insere(2);//testando a parada
//		fila.insere(3);
//		fila.insere(4);
//		fila.insere(5);
//		fila.insere(6);
//		fila.insere(7);
		while (!fila.isEmpty()) {//enquanto ela n�o for vazia
			Object x = fila.retira();
			System.out.println("Elemento " + x + " retirado");
		}
	}
}