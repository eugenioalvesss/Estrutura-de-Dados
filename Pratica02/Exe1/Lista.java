package Exe1;

public class Lista {
	
	 private Elemento primeiro_posicao;

	 private Elemento ultima_posicao;

	 private int tamanho;
	    
	    public Lista(){
	        this.tamanho = 0;
	    }

	    public int getTamanho() {
	        return tamanho;
	    }

	    public void adicionar(int novoValor){
	    	
	        Elemento new_elemento = new Elemento(novoValor);

	        if (this.primeiro_posicao == null && this.ultima_posicao == null){
	            this.primeiro_posicao = new_elemento;
	            this.ultima_posicao = new_elemento;
	        }else{
	        	
	            this.ultima_posicao.setProximo(new_elemento);
	            this.ultima_posicao = new_elemento;

	        }
	        this.tamanho++;
	    }

	    public int get_valor_na_posicao(int posicao){

	        Elemento atual = this.primeiro_posicao;

	        for(int i=0; i < posicao; i++){

	            if (atual.getProximo() != null){

	                atual = atual.getProximo();
	           }

	       }

	        return atual.getValor_elemento();
	}

}