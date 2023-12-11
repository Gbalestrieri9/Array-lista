//03 - Seguindo do exercício 02, adicione o .sort para filtrar o array exibido no HTML.
//alfabeticamente

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array3_lista {
	
public static void main(String[] args) {
		
			List<String> deuses = new ArrayList<String>();
		    deuses.add("Odin");
		    deuses.add("Loki");
		    deuses.add("Thor"); 
	    
	        Collections.sort(deuses);
	    	System.out.println(deuses);
	    }

}
