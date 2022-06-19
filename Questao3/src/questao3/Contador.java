package questao3;

import java.util.Scanner;

public class Contador {
	
	    public static void main (String args[]){
	    		    	
	    	Scanner input = new Scanner(System.in);
	    	
	    	String frase;
	    	
	    	System.out.println("Digite a sua frase: ");
	    	
	    	frase = input.nextLine();
	    		    				
			  String divertido = ":-)"; int vezesdivertido = 0; for (int i = 0; i <
			  frase.length(); i++) { if (frase.substring(i).startsWith(divertido)) {
			  vezesdivertido ++; } }
			  	  			 
	          String triste = ":-(";
	          int vezestriste = 0;
	          for (int j = 0; j < frase.length(); j++) {
	          if (frase.substring(j).startsWith(triste)) {
	                vezestriste ++;
	            }
	           }
	        
	       
	        
	          if (vezesdivertido > vezestriste) {
	        	System.out.println("O sentimento expresso na frase acima é: Divertido");
	          	} else if (vezesdivertido < vezestriste) {
	        	System.out.println("O sentimento expresso na frase acima é: Chateado");
	       		} else if (vezesdivertido == vezestriste) {
	        	System.out.println("O sentimento expresso na frase acima é: Neutro");
	        
	        	input.close();
	        }
	    }
	}