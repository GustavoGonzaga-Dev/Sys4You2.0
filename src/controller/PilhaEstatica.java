package controller;


import javax.swing.JOptionPane;

public class PilhaEstatica {

    int inicio;
    int fim;
    int tamanho;
    int qtdeElementos = 0;
    String p[];

    public PilhaEstatica() {
        inicio = fim = -1;
        tamanho = 5; //tamanho do vetor
        p = new String[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia() { //verifica se esta vazia
        if (qtdeElementos == 0) {
            return true;
        }
        return false;
    }

    public boolean estaCheia() {//verifica se esta cheia
        if (qtdeElementos == tamanho - 1) {
            return true;
        }
        return false;
    }

    public void adicionar(String string) {//adiciona itens
        if (!estaCheia()) {
            if (inicio == -1) {
                inicio = 0;
            }
            fim++;
            p[fim] = string;
            qtdeElementos++;
        }
    }

    public void remover() {//Remove ultimo item adicionado
    	if (!estaVazia()) {
            fim--;
            qtdeElementos--;
        }
    }

    public void mostrar() { //mostra a pilha
        String elementos = "";
        for (int i = fim; i >= 0; i--) {
            elementos += p[i] + "\n";
        }
        JOptionPane.showMessageDialog(
                null,
                elementos);
    }
} // fim da classe Pilha