package Questao4;

public class Principal {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        boolean verifica= p.inverter("Arara");
    	
        
        if (verifica) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

     
    }
}
