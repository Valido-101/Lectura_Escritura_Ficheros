package Lectura;

import java.io.FileReader;
import java.io.IOException;

public class Lectura_ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lee_Fichero acceso=new Lee_Fichero();
		
		char[] stats=new char[3];
		
		stats=acceso.lee();
		
		for(int e: stats) {
			
			System.out.println(e);
			
		}
		
	}
	
}

//PRIMERO
//Creamos una calse que será la encargada de la acción
class Lee_Fichero{

	//Como queremos Leer un fichero, vemos en la API la clase Reader	
	//RUTA C:\Users\Server\Downloads\Demo.txt
	//En la subclase InputStreamReader vemos como trasforma los bytes a su codigo ascii
	
	//FileReader para indicarle el fichero a leer
	
	public char[] lee() {
		
		char[] stats=new char[3];
		
		try {
			FileReader entrada=new FileReader("C:/Users/Jesus/Desktop/Eclipse/Ficheros/src/Escritura/fichero.txt");
			//boton derecho para crear excepcion
			
			int x=0,i=0;
			//con esto almacena el primer caracter
			//modificamos la excepcióm
			
			while (x!=-1) {
				//mientras f sea distinto de -1, es decir que no haya llegado al final
				
				x=entrada.read();
				
				//Lee solo la primera línea
				/*if((char)x=='\n') {
					
					break;
					
				}
				*/
				
				if(x!='\n') {
					
					stats[i]=(char)x;
					
				}else {
					
					i++;
					
				}
				
				if(x==-1){
					//Si f es igual a -1 rompe el bucle para que no salga el carácter ?
					break;
				}
				
				//char letra=(char)x;
				
				//System.out.print(letra);
				//con esto obtenemos el codigo de cada caracter
							
			}
			
			
			entrada.close();
			System.out.println("\nTarea Completada");
			return stats;
			
		} catch (IOException e) {
			System.out.println("ERROR!, no se encuentra el fichero");
			return stats;
		}
		
		//siempre nos pide TryCatch para controlar errores de subida
		
		
		//la Clase Reader va devolviendo caracteres hasta el final que devuelve un -1
	}
	
	
	
}
