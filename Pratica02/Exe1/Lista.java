package Exe1;

public class Lista {
	
	private Elemento primeira_posicao;
	
	private Elemento ultima_posicao;

	private int tamanho_lista;

	public Lista() {
		this.tamanho_lista = 0;
		
	}
	
	public void add (int novo_valor) {
		
		// transformando valor no tipo elemento 
		Elemento novo_elemento = new Elemento(novo_valor);
		
		// se a fila for vazia 
		if(this.primeira_posicao == null && ultima_posicao == null) {
			primeira_posicao = novo_elemento;
			ultima_posicao = novo_elemento;
		}else { // Se já tiver alguem na fila 
			ultima_posicao = novo_valor;
			
		}
		
	}
	
	public int getVariavel (int valor_posicao) {
		
		Elemento primeira_posicao = this.primeira_posicao;
		
		for(int i=0; i < valor_posicao; i++) {
			if(primeira_posicao.getProximo() != null) {
				primeira_posicao = primeira_posicao.getProximo();
				
			}
		}
		
		return primeira_posicao.getValor_posicao();
	}
}
