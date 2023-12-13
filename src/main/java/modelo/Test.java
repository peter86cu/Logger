package modelo;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		String tarjeta = "5011098214741787"; 
       // System.out.println("*************"+tarjeta.substring(tarjeta.length() - 4));
        
		
    	
    	//System.out.println(nuevaP.getNombre()+" "+nuevaP.getEdad());
    	
    	Persona testp= new Persona("Ppe2", 15);
    	for (int i = 0; i < args.length; i++) {
    		Persona nuevaP= new Persona();
        	nuevaP.setNombre("Pepe");
        	nuevaP.setEdad(25);
		}
	}

	
	
}
