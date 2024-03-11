package arraylist;

import java.io.*;

public class UsoArayList {
	
	public static void main(String[] args) {
		
	ArayList archivos=new ArayList(4);
	
	archivos.add("Pepe");
	archivos.add("Pup");
	archivos.add("KIM");
	archivos.add("Yusoep");
	
	String nombrePersona=(String)archivos.get(2);
	
	System.out.println(nombrePersona);

		
		
	}
	

}
