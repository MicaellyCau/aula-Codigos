package Questao4;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {
	
	        Stack<Character> pilha = new Stack<Character>();
	        StringBuilder inverso= new StringBuilder();
	        public  boolean inverter(String palavra) {

	        for (int cont = 0; cont<palavra.length(); cont++) {
	            pilha.push(palavra.charAt(cont));
	        }

	     
	        while (!pilha.isEmpty()) {
	            inverso.append(pilha.pop());
	        }

	    
	        if (palavra.equalsIgnoreCase(""+inverso.toString())) {
	           
	                return true; 
	            }
	        else {
	        	return false;
	        }
	        }
	        
	    


		
}