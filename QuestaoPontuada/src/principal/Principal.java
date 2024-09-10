package principal;

import basicas.Contato;
import lista.ListaDuplamenteEncadeada;

public class Principal {
public static void main(String[] args) {
	Contato c1 = new Contato("Geraldo", "rua do pão","(76)4343434344");
	Contato c2 = new Contato("Abneildo", "rua da Soja","(76)33333344");
	Contato c3 = new Contato("Filaiane", "rua do Sal","(76)5555555544");
	Contato c4 = new Contato("Sofia", "rua do Sabão","(76)444444444");

	ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
l.adicionarInicio(c1);
l.adicionarNoFim(c3);
l.imprimir();
System.out.println("-------------------------------");

l.adicionarPorPosicao(2,c4 );
l.adicionarPorPosicao(3, c2);
l.imprimir();
System.out.println("-------------------------------");
System.out.println("Pesquisar contato: "+l.pesquisarPorNome("Sofia"));
System.out.println("Procurar por posição:"+l.procurarPorPosicao(2));
System.out.println("-------------------------------");
l.removerDoInicio();
l.removerDoFinal();
l.imprimir();
System.out.println("-------------------------------");
		l.removerPorPosicao(0);
		l.imprimir();
}
}