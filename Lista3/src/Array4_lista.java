//04 - Exiba a quantidade de letras que possuem o texto inserido ao clicar no botão.
//Exemplos de entrada e saída:
//'Caio' // 4
//'Felipe' // 6
//'Roberto' // 7
//'Tiago' // 5

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array4_lista {
	
	public static void main(String[] args) {
		
		List<String> deuses = new ArrayList<String>();
	    deuses.add("Odin");
	    deuses.add("Loki");
	    deuses.add("Thor"); 
    
        Collections.sort(deuses);
    	System.out.println(deuses);
    }

}


