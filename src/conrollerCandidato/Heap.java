package conrollerCandidato;

import java.io.IOException;

import javax.swing.JOptionPane;

import view.ListaCandidatos;

class Heap {
	static int x = -1;
	static String[] heap = new String[10];
	public static StringBuffer bufferApresenta = new StringBuffer();
	public static ListaCandidatos lista = new ListaCandidatos();
	
	static void heapForm(String k) {
		x++;
		heap[x] = k;
		int filho = x;
		String tmp;
		int index = x / 2;
		while (index >= 0) {
			if (heap[index].compareTo(heap[filho]) > 0) {
				tmp = heap[index];
				heap[index] = heap[filho];
				heap[filho] = tmp;
				filho = index;
				index = index / 2;
			} else {
				break;
			}
		}
	}

	static void heapSort() {
		int esquerda, direita;
		while (x >= 0) {
			String k;
			k = heap[0];
			bufferApresenta.append(k);
			heap[0] = heap[x];
			x = x - 1;
			String tmp;
			int index = 0;
			int length = x;
			esquerda = 1;
			direita = esquerda + 1;
			while (esquerda <= length) {
				if (heap[index].compareTo(heap[esquerda]) <= 0 && heap[index].compareTo(heap[direita]) <= 0) {
					break;
				}else {
					if (heap[esquerda].compareTo(heap[direita]) < 0) {
						tmp = heap[index];
						heap[index] = heap[esquerda];
						heap[esquerda] = tmp;
						index = esquerda;
					}else {
						tmp = heap[index];
						heap[index] = heap[direita];
						heap[direita] = tmp;
						index = direita;
					}
				}
				esquerda = 2 * esquerda;
				direita = esquerda + 1;
			}
		}
	}

	static void sort(String array[], int n) {
		for (int i = 0; i < n; i++) {
			heapForm(array[i]+"\n");
		}
		heapSort();
	}

	public static void inicio(String[] nome, int n, String permissao) throws IOException {
		bufferApresenta.append("    *NOME*        |*| |*|      *CURSO*     |*| |*|   *NUMERO DE INSCRI��O* \n ===================================================== \n ");
		sort(nome, n);
		JOptionPane.showMessageDialog(null, bufferApresenta);
		lista.MenuListaCandidato(permissao);
	}
}
