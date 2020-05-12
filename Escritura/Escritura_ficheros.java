package Escritura;

import java.io.FileWriter;
import java.io.IOException;

public class Escritura_ficheros {

	public static void main(String[] args) {

		Escribir esc =new Escribir();
		esc.escribe();
		
	}

}

class Escribir{
	
	public void escribe() {
		
		String frase="Hola mundo, estoy escribiendo en ficheros\n";
		
		try {
			FileWriter escritor =new FileWriter("C:/Users/Jesus/Desktop/Eclipse/Ficheros/src/Escritura/fichero.txt", true);
			//el argumento true agrega el contenido si el fichero existe
			//Sin true solo machaca el fichero
			
			for (int i=0; i<frase.length();i++) {
				
				escritor.write(frase.charAt(i));
			}
			
			System.out.println("Tarea Completada");
			escritor.close();
			
		} catch (IOException e) {

			System.out.println("Errrrrror! 404");
		}
	}
	
	
}
