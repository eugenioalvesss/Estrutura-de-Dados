package Exe1;

public class Elemento {
	
	private int valor_posicao;
	private Elemento proximo;
	
	public Elemento(int valor_posicao) {
		this.valor_posicao = valor_posicao;
	}

	public int getValor_posicao() {
		return valor_posicao;
	}

	public void setValor_posicao(int valor_posicao) {
		this.valor_posicao = valor_posicao;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	
	
	

}
