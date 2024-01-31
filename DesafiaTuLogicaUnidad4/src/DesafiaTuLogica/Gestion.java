package DesafiaTuLogica;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
    
	Scanner scanner = new Scanner(System.in);
	
		Piloto piloto1= new Piloto (123,"Peter Maverick", 10000, "capitán" );
		Piloto piloto2= new Piloto (234, "Natasha Phoenix",3000, "teniente");
		Piloto piloto3= new Piloto (345, "Bradley Rooster", 3500, "teniente");
		
		//Pilotos 4 y 5 introducidos por el usuario//
		
		System.out.println("Introduce los datos del piloto 4:");
		System.out.println("id: ");
		int idPiloto4=scanner.nextInt();
		scanner.nextLine(); //Para consumir la nueva línea pendiente//
		System.out.println("Nombre completo: ");
		String nomPiloto4=scanner.nextLine();
		System.out.println("Horas de vuelo: ");
		int horasVueloPiloto4=scanner.nextInt();
		scanner.nextLine();
		System.out.println ("Rango del piloto: ");
		String rangoPiloto4=scanner.nextLine();
		
		Piloto piloto4 =new Piloto (idPiloto4,nomPiloto4,horasVueloPiloto4,rangoPiloto4);
		
		System.out.println();
		//Segundo piloto introducido por el usuario//
		System.out.println("Introduce los datos del piloto 5:");
		System.out.println("id: ");
		int idPiloto5=scanner.nextInt();
		scanner.nextLine(); //Para consumir la nueva línea pendiente//
		System.out.println("Nombre completo: ");
		String nomPiloto5=scanner.nextLine();
		System.out.println("Horas de vuelo: ");
		int horasVueloPiloto5=scanner.nextInt();
		scanner.nextLine();
		System.out.println ("Rango del piloto: ");
		String rangoPiloto5=scanner.nextLine();
		
		Piloto piloto5 = new Piloto (idPiloto5,nomPiloto5,horasVueloPiloto5,rangoPiloto5);
		
		//mostrar datos de los pilotos 1, 3, 4 y 5 con método mostrarPiloto();//
		
	    System.out.println("Datos de piloto 1: ");
	    piloto1.mostrarPiloto();
	    System.out.println();
	    System.out.println("Datos del piloto 3: ");
	    piloto3.mostrarPiloto();
	    System.out.println();
	    System.out.println("Datos del piloto 4: ");
	    piloto4.mostrarPiloto();
	    System.out.println();
	    System.out.println("Datos del piloto 5: ");
	    piloto5.mostrarPiloto();
	    
	 // instanciación objetos avion//
	 	Combate avionCombate1=new Combate (798,"Boeing",4,piloto2,true);
	 	Combate avionCombate2=new Combate ( 234, "Super Hornet",3, piloto1,false);
	 	Entrenamiento avionEntrenamiento1= new Entrenamiento (564, "Cessna",1, piloto3,true);
	 		
	 //Introducción de datos para aviones 4 y 5 por el usuario//
		System.out.println(); 	
	    System.out.println("Introduce los datos del avión de entramiento 2: ");
		System.out.println( "Número identificador: ");
		int idAvionEntrenamiento2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Modelo:");
		String modAvionEntrenamiento2= scanner.nextLine();
		System.out.println("Capacidad: ");
		int capAvionEntrenamiento2= scanner.nextInt();
		scanner.nextLine();
		System.out.println("Elija el piloto por su número:1,2,3,4 o 5");
		int numPilotoElegido= scanner.nextInt();
		scanner.nextLine();
		
	    System.out.println("¿Tiene doble mando?");
	    String tieneMandoAvion2=scanner.nextLine();
	    boolean tieneDobleMandoAvion2= tieneMandoAvion2.equalsIgnoreCase("si")?true:false;
	    
	    Piloto pilotoElegido = null;
		switch(numPilotoElegido) {
		case 1: 
		       pilotoElegido = piloto1;
		       break;
		case 2:
		       pilotoElegido = piloto2;
		        break;
		case 3:
			   pilotoElegido = piloto3;
		       break;
		case 4:
			   pilotoElegido =  piloto4;
			   break;
		case 5:
			   pilotoElegido =  piloto5;
			   break;
	    default:
	    	System.out.println("Vuelva a introducir un número de piloto");
		}
	    
	    Entrenamiento avionEntrenamiento2= new Entrenamiento (idAvionEntrenamiento2,modAvionEntrenamiento2,capAvionEntrenamiento2,pilotoElegido,tieneDobleMandoAvion2);
	    
	    System.out.println();
	    System.out.println("Introduce los datos del avión de entramiento 3: ");
		System.out.println( "Número identificador: ");
		int idAvionEntrenamiento3 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Modelo:");
		String modAvionEntrenamiento3= scanner.nextLine();
		System.out.println("Capacidad: ");
		int capAvionEntrenamiento3= scanner.nextInt();
		scanner.nextLine();
		System.out.println("Elija el piloto por su número:1,2,3,4 o 5");
		int numPilotoElegido2= scanner.nextInt();
		scanner.nextLine();
		Piloto pilotoElegido2 = null;
		switch(numPilotoElegido2) {
		case 1: 
		       pilotoElegido2 = piloto1;
		     break;
		case 2:
		       pilotoElegido2 = piloto2;
		     break;
		case 3:
			   pilotoElegido2 = piloto3;
		break;
		case 4:
			   pilotoElegido2 =  piloto4;
			  break;
		case 5:
			   pilotoElegido2 =  piloto5;
			  break;
	    default:
	    	System.out.println("Vuelva a introducir un número de piloto");
		}
	    System.out.println("¿Tiene doble mando?");
	    String tieneMandoAvion3=scanner.nextLine();
	    boolean tieneDobleMandoAvion3= tieneMandoAvion3.equalsIgnoreCase("si")?true:false;
	    
	    Entrenamiento avionEntrenamiento3= new Entrenamiento (idAvionEntrenamiento3,modAvionEntrenamiento3,capAvionEntrenamiento3,pilotoElegido2,tieneDobleMandoAvion3);
	    
	    
	    
       //mostrar datos de los aviones con método mostrarAvion();//
		
	    System.out.println("---Datos del avión de combate 1---");
	    avionCombate1.mostrarAvion();
	    avionCombate1.tecnologiaFurtiva();
	    System.out.println();
	    System.out.println("--Datos del avión de combate 2---");
	    avionCombate2.mostrarAvion();
	    avionCombate2.tecnologiaFurtiva();
	    System.out.println();
	    System.out.println("---Datos del avión de entrenamiento 1---");
	    avionEntrenamiento1.mostrarAvion();
	    avionEntrenamiento1.mando();
	    System.out.println();
	    System.out.println("---Datos del avión de entrenamiento 2---");
	    avionEntrenamiento2.mostrarAvion();
	    avionEntrenamiento2.mando();
	    System.out.println("---Datos del avión de entrenamiento 3---");
	    avionEntrenamiento3.mostrarAvion();
	    avionEntrenamiento3.mando();	
		
			
		scanner.close();
		
		}
}


