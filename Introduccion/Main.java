package Introduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> estudiantes = new ArrayList<>();
    static List<Double> calificaciones = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de gestión de estudiantes.");
        
        boolean salir = false;
        while (!salir) {
        	mostrarMenu1();
        	int opcion = leerEntero("Seleccione una Opcion: ");
        	switch (opcion) {
        	case 1: agregarEstudiante1(); break;
        	case 2: mostrarLista1(); break;
        	case 3: calcularPromedio1(); break;
        	case 4: agregarEstudiante1(); break;
        	case 5: 
        		System.out.println("Saliendo del Sistema...");
        		salir = true;
        		break;
        	default:
        		System.out.println("Opción no válida. Intente de nuevo.");
        	}
        }
        }
        public static void mostrarMenu1() {
        	System.out.println("\n.Agregar estudiante\n2. Mostrar lista\n3. Calcular premedio\n. Calificacion mas alta\n. Salir");
        }
        	
        	public static void agregarEstudiante1() {
        		System.out.print("Ingrese el Nombre: ");
        		String nombre= scanner.nextLine();
        		
        		double calificacion = leerDouble("ingrese calificacion (0-10):");
        		
        		if (calificacion >=0 && calificacion <=10) {
        			estudiantes.add(nombre);
        			calificaciones.add(calificacion);
        			System.out.println("Estudiante Agregado.");
        		} else {
        			System.out.println("Error: La calificacion debe estar entre 0 y 10.");
        		}
        		}
        		
        	public static void mostrarLista1() {
                if (estudiantes.isEmpty()) {
                    System.out.println("No hay estudiantes registrados.");
                    return;
                }
                System.out.println("\nLista de estudiantes:");
                for (int i = 0; i < estudiantes.size(); i++) {
                    System.out.println(estudiantes.get(i) + " - Calificación: " + calificaciones.get(i));
                }
            }
        	public static void calcularPromedio1() {
                if (calificaciones.isEmpty()) {
                    System.out.println("No hay calificaciones registradas.");
                    return;
                }
                double suma = 0;
                for (double c : calificaciones) suma += c;
                System.out.println("El promedio es: " + (suma / calificaciones.size()));
            }
        	 public static void mostrarEstudianteMasAlto() {
        	        if (calificaciones.isEmpty()) {
        	            System.out.println("No hay datos.");
        	            return;
        	        }
        	        double max = calificaciones.get(0);
        	        String nombreMax = estudiantes.get(0);
        	        for (int i = 1; i < calificaciones.size(); i++) {
        	            if (calificaciones.get(i) > max) {
        	                max = calificaciones.get(i);
        	                nombreMax = estudiantes.get(i);
        	            }
        	        }
        	        System.out.println("El estudiante con nota más alta es: " + nombreMax + " (" + max + ")");}
        	        public static int leerEntero(String mensaje) {
        	        	while (true) {
        	        		try {
        	        			System.out.print(mensaje);
        	        			return Integer.parseInt(scanner.nextLine());
        	        		}catch (NumberFormatException e) {
        	        			System.out.println("Error: Ingrese un numero entero Valido.");
        	        			
        	        		}
        	        	}
        	        }
        	    public static double leerDouble(String mensaje) {
        	    	while (true) {
        	    		try {
        	    		System.out.print(mensaje);
        	    		return Double.parseDouble(scanner.nextLine());
        	    		}catch (NumberFormatException e) {
        	    			System.out.println("Error: Ingrese un Valor Numerico.");
        	    		}
        	    	}
        	    	
        	    }
        	  }
        	    	