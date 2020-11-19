package controller;

public class FilaDinamica<T> {
	private NoFD<T> start;
	private NoFD<T> aux;
	private NoFD<T> n;

	public FilaDinamica() {
		this.start = null;
	}

	public void add(T dado) {
		n = new NoFD<T>(dado);
		if(vazia()) {
			this.start = n;
		}else {
			aux = this.start;
			while(aux.getProx()!=null) {
				aux = aux.getProx();
			}
			aux.setProx(n);
		}
	}

	public T remove() {
		if(!vazia()) {
			T r = this.start.getDado();
			this.start = this.start.getProx();
			return r;
		}
		return null;
	}

	public String mostra() {
		String r;
		StringBuffer buffer = new StringBuffer();
		if(!vazia()) {
			NoFD<T> aux = this.start;
			while(aux!=null) {
				buffer.append(aux.getDado() + "\n");
				aux = aux.getProx();
			}
		}
		r = buffer.toString();
		return r;

	}

	private boolean vazia() {
		return this.start == null;
	}

}
