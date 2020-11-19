package controller;

public class NoFD<T> {

	private T dado;
	private NoFD<T> prox;

	public NoFD(T dado) {
		this.dado = dado;
		this.prox = null;
	}

	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}

	public NoFD<T> getProx() {
		return prox;
	}

	public void setProx(NoFD<T> prox) {
		this.prox = prox;
	}


}
