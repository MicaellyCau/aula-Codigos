package fibonacci;

public class Recursivo {
public int calcularFibo(int a) {
	
	if(a<=1) {
		return a;
	}
	
	else {
		return calcularFibo(a-1)+ calcularFibo(a-2);
	}
	
}
public String imprimirSequencia(int qtd) {
	
	String seq= "[";
	for(int cont= 0; cont<qtd;cont++) {
		seq+= calcularFibo(cont)+" ";
		if(calcularFibo(cont)>100) {
			break;
		}
	}
	seq+="]";
	return seq;
}

}
