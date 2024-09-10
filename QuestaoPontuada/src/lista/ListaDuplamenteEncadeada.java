package lista;

import basicas.Contato;

public class ListaDuplamenteEncadeada {

	private Celula cabeca;
	private  Celula calda;
	private int totalDeElementos = 0;

	public ListaDuplamenteEncadeada() {
	}
	public ListaDuplamenteEncadeada(Celula cabeca, Celula calda, int totalDeElementos) {
		this.cabeca = cabeca;
		this.calda = calda;
		this.totalDeElementos = totalDeElementos;
	}
	public void adicionarInicio(Contato contato) {
		
		if(this.totalDeElementos==0) {
			Celula nova = new Celula(null, contato);
			this.cabeca= nova;
			this.calda= nova;
		}
		else {
			
		Celula nova= new Celula(this.cabeca,contato);
			this.cabeca.setAnterior(nova);;
			this.cabeca= nova;
		}
		this.totalDeElementos++;
	}
	public void adicionarNoFim(Contato contato){
		
		if(this.totalDeElementos==0){
			adicionarInicio(contato);
			}
			else {
				Celula nova = new Celula(null, this.calda,contato);
			this.calda.setProxima(nova);
			this.calda = nova;
				
			}
		this.totalDeElementos++;
	}
	public void adicionarPorPosicao(int posicao, Contato contato) {
	    if (posicao < 0 || posicao > this.totalDeElementos) {
	        throw new IllegalArgumentException("Posição inválida.");
	    }
	    if (posicao == 0) {
	        adicionarInicio(contato);
	    }
	    else if (posicao == this.totalDeElementos) {
	        adicionarNoFim(contato);
	    }
	    else {
	        Celula atual = this.cabeca;
	        for (int i = 0; i < posicao - 1; i++) {
	            atual = atual.getProxima();
	        }
	        Celula nova = new Celula(atual.getProxima(), atual, contato);
	        atual.getProxima().setAnterior(nova);
	        atual.setProxima(nova);
	        this.totalDeElementos++;
	    }
	}
	public void removerDoInicio() {
		 
		if (this.totalDeElementos == 0) {
	        throw new IllegalStateException("Lista vazia.");
	        
	    }
		this.cabeca = this.cabeca.getProxima();

	    if (this.cabeca != null) {
	        this.cabeca.setAnterior(null);
	    } else {
	        this.calda = null; 
	    }
	    this.totalDeElementos--;
	}

	public void removerDoFinal() {
	    if (this.totalDeElementos == 0) {
	        throw new IllegalStateException("Lista vazia.");
	    }
	    this.calda = this.calda.getAnterior();
	    if (this.calda != null) {
	        this.calda.setProxima(null);
	    } else {
	        this.cabeca = null;  
	    }
	    this.totalDeElementos--;
	}
	public Object procurarPorPosicao(int posicao) {
		if(posicao<0|| posicao >= this.totalDeElementos) {
	throw new IllegalArgumentException("Posição inválida");
		}
		 Celula atual = this.cabeca;
	     for (int i = 0; i < posicao; i++) {
	         atual = atual.getProxima();
	     }
		return atual.getProxima();
		}
	public void removerPorPosicao(int posicao) {
	    if (posicao < 0 || posicao >= this.totalDeElementos) {
	        throw new IllegalArgumentException("Posição fora do intervalo válido.");
	    }
	    if (posicao == 0) {
	        removerDoInicio();
	    } else if (posicao == this.totalDeElementos - 1) {
	        removerDoFinal();
	    } else {
	        Celula atual = this.cabeca;
	        for (int i = 0; i < posicao; i++) {
	            atual = atual.getProxima();
	        }
	        Celula anterior = atual.getAnterior();
	        Celula proxima = atual.getProxima();
	        anterior.setProxima(proxima);
	        proxima.setAnterior(anterior);
	      
	    }
	    this.totalDeElementos--;
	}

	public void imprimir() {
		
		   Celula aux = this.cabeca;
	     for (int cont = 0; cont < this.totalDeElementos; cont++) {
	         System.out.println(aux.getElemento());
	         aux = aux.getProxima();
	     }
	}
	public Contato pesquisarPorNome(String nome) {
		Celula atual = this.cabeca;
		while(atual != null) {
			Contato contato = (Contato)atual.getElemento();
			if(contato.getNome().equals(nome)) {
				return contato;
		}
			atual=atual.getProxima();
	}
		return null;
		}
	}




