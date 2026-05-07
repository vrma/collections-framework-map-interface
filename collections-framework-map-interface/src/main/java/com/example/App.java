package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
	
    public static void main(String[] args) {
    	
    	/* ¿Que es un Map Interface, o un mapa simplemente? 
    	 * 
    	 * Es una coleccion, aunque no hereda de la interfaz Collection, pero se puede tratar 
    	 * como tal utilizando las Collections Views (Vistas de Colecciones), que veremos
    	 * en breve.
    	 * 
    	 * Concretamente un Mapa, es una coleccion, tambien denominado un objeto que relaciona
    	 * claves con valores, lo que antiguamente se llamaba una estructura hash (clave (key) y
    	 * valor (value)), donde las claves no pueden repetirse.
    	 * 
    	 * Los metodos de ordenamiento y de busqueda que son aplicables a las interfaces que 
    	 * heredan de Collection no son aplicables a la interface Map, por ejemplo el 
    	 * metodo sort no se le puede aplicar a un mapa.
    	 * 
    	 * En resumen una Interface Map, mapea (relaciona) claves con valor en un contenedor, 
    	 * que se puede crear de varias formas y recorrer de varias formas tambien */
    	
    	/* A modo de ejemplo, vamos a crear una coleccion (Map Interface) que almacene
    	 * frecuencia de repeticion/ocurrencia de un array de palabras que se reciben como 
    	 * parametro en el metodo main, cuando se lanza la aplicacion */
    	
    	// Primero: Comprobar si estamos recibiendo el array de nombres en la variable args,
    	// cuando se lanza la aplicacion
    	
    	List<String> listadoDeArgumentos = Arrays.asList(args);
    	
    	listadoDeArgumentos.forEach(System.out::println);
    	
    	// Creacion del mapa a partir del listado de argumentos
    	
    	Map<String, Long> m = null;
    	
    	// Variante # 1 de creacion del mapa a partir de recorrer el listado de argumentos
    	// utilizando Operaciones de Agregado (Tuberia, metodos de la clase Stream, lambda,
    	// metodos por referencia, en fin, Programacion Funcional)
    	
    	m = listadoDeArgumentos.stream()
    		 .collect(Collectors.groupingBy(Function.identity(), 
    				Collectors.counting()));
    	
    	System.out.println(m);
    	
    	// Variante # 2 (Recomendada)
    	
    	var m2 = listadoDeArgumentos.stream()
    				.collect(Collectors.groupingBy(nombre -> nombre,
    						Collectors.counting()));
    	
    	System.out.println(m2);
    	
    	/* Creacion de listado de empleados, estudiantes y personas tambien */
    	
    	List<? extends Persona> listadoGenerico = new ArrayList<>();
    	
    	Empleado emp1 = Empleado.builder()
    			.nombre("Jorge Francisco")
    			.primerApellido("Alborch")
    			.segundoApellido("Villar")
    			.genero(Genero.HOMBRE)
    			.fechaNacimiento(LocalDate.of(1973, Month.JUNE, 23))
    			.dpto(Dpto.INFORMATICA)
    			.salario(new BigDecimal(3500.50))
    			.fechaAlta(LocalDate.of(1990, Month.SEPTEMBER, 22))
    			.build();
    	
   	 	Empleado emp2 = Empleado.builder()
    			.nombre("Andres")
    			.primerApellido("Alonso")
    			.segundoApellido("Pelaez")
    			.genero(Genero.HOMBRE)
    			.fechaNacimiento(LocalDate.of(1983, Month.SEPTEMBER, 23))
    			.dpto(Dpto.INFORMATICA)
    			.salario(new BigDecimal(3400.50))
    			.fechaAlta(LocalDate.of(1995, Month.SEPTEMBER, 22))
    			.build();
   	 	
     	Empleado emp3 = Empleado.builder()
    			.nombre("Jeronimo")
    			.primerApellido("Arenal")
    			.segundoApellido("Gomez")
    			.genero(Genero.HOMBRE)
    			.fechaNacimiento(LocalDate.of(1968, Month.OCTOBER, 20))
    			.dpto(Dpto.CONTABILIDAD)
    			.salario(new BigDecimal(3600.50))
    			.fechaAlta(LocalDate.of(1977, Month.JANUARY, 4))
    			.build();
     	
     	Empleado emp4 = Empleado.builder()
    			.nombre("Carolina")
    			.primerApellido("Garzon")
    			.segundoApellido("Becerra")
    			.genero(Genero.MUJER)
    			.fechaNacimiento(LocalDate.of(2001, Month.JUNE, 7))
    			.dpto(Dpto.INFORMATICA)
    			.salario(new BigDecimal(3700.50))
    			.fechaAlta(LocalDate.of(2020, Month.SEPTEMBER, 10))
    			.build();
     	
     	
     	Empleado emp5 = Empleado.builder()
    			.nombre("Mariana")
    			.primerApellido("Garzon")
    			.segundoApellido("Villar")
    			.genero(Genero.MUJER)
    			.fechaNacimiento(LocalDate.of(2000, Month.AUGUST, 4))
    			.dpto(Dpto.FINANZAS)
    			.salario(new BigDecimal(3300.50))
    			.fechaAlta(LocalDate.of(2022, Month.SEPTEMBER, 25))
    			.build();
     	
     	Empleado emp6 = Empleado.builder()
    			.nombre("Francisca")
    			.primerApellido("Alvarez")
    			.segundoApellido("Glez")
    			.genero(Genero.MUJER)
    			.fechaNacimiento(LocalDate.of(1995, Month.DECEMBER, 10))
    			.dpto(Dpto.RRRHH)
    			.salario(new BigDecimal(2500.50))
    			.fechaAlta(LocalDate.of(2010, Month.SEPTEMBER, 5))
    			.build();
     	
     	Empleado emp7 = Empleado.builder()
    			.nombre("Maricarmen")
    			.primerApellido("Becerra")
    			.segundoApellido("Mtnez")
    			.genero(Genero.MUJER)
    			.fechaNacimiento(LocalDate.of(2003, Month.FEBRUARY, 14))
    			.dpto(Dpto.FINANZAS)
    			.salario(new BigDecimal(2600.50))
    			.fechaAlta(LocalDate.of(2021, Month.SEPTEMBER, 8))
    			.build();
     	
     	Empleado emp8 = Empleado.builder()
    			.nombre("Eva")
    			.primerApellido("Cornide")
    			.segundoApellido("Machado")
    			.genero(Genero.MUJER)
    			.fechaNacimiento(LocalDate.of(1990, Month.MAY, 18))
    			.dpto(Dpto.INFORMATICA)
    			.salario(new BigDecimal(3500.50))
    			.fechaAlta(LocalDate.of(2015, Month.SEPTEMBER, 22))
    			.build();
     	
     	Empleado emp9 = Empleado.builder()
    			.nombre("Alberto")
    			.primerApellido("Glez")
    			.segundoApellido("Sanchez")
    			.genero(Genero.HOMBRE)
    			.fechaNacimiento(LocalDate.of(1990, Month.FEBRUARY, 14))
    			.dpto(Dpto.FINANZAS)
    			.salario(new BigDecimal(2600.50))
    			.fechaAlta(LocalDate.of(2008, Month.SEPTEMBER, 8))
    			.build();
     	
     	Empleado emp10 = Empleado.builder()
    			.nombre("Javier")
    			.primerApellido("Glez")
    			.segundoApellido("Sanchez")
    			.genero(Genero.HOMBRE)
    			.fechaNacimiento(LocalDate.of(1995, Month.MAY, 20))
    			.dpto(Dpto.RRRHH)
    			.salario(new BigDecimal(3500.50))
    			.fechaAlta(LocalDate.of(2015, Month.SEPTEMBER, 22))
    			.build();
     	
     	Estudiante estudiante1 = Estudiante.builder()
     			.nombre("Alex Eduardo")
     			.primerApellido("Pilicita")
     			.segundoApellido("Changoluisa")
     			.genero(Genero.HOMBRE)
     			.fechaNacimiento(LocalDate.of(1991, Month.MAY, 25))
     			.totalAsignaturas(10)
     			.facultad(Facultad.INGENIERIA)
     			.fechaAltaFacultad(LocalDate.of(2020, Month.JANUARY, 6))
     			.build();
     	
     	listadoGenerico = Arrays.asList(emp1, 
     			emp2, 
     			emp3, 
     			emp4, 
     			emp5, 
     			emp6, 
     			emp7, 
     			emp8, 
     			emp9, 
     			emp10,
     			estudiante1);
     	
     	// listadoGenerico.add(emp1);
     	
     	/* Crear una coleccion que agrupe empleados por genero */   
     	
//     	Map<Genero, List<Empleado>> empleadosPorGenero = empleados.stream()
//     			.collect(Collectors.groupingBy(empleado -> empleado.getGenero(),
//     					Collectors.toList()));
     	
     	/* Cuando se recorre una lista que es del mismo tipo que los elementos del valor
     	 * del mapa, NO hay que hacer absolutamente nada para que el elemento que circula
     	 * por la tuberia termine en la lista correspondiente al valor de la entrada del 
     	 * mapa 
     	 * 
     	 * Concretamente, en este caso, el Collectors.toList() sobra.*/
     	
     	Map<Genero, List<Empleado>> empleadosPorGenero = listadoGenerico.stream()
     			.filter(obj -> obj instanceof Empleado)
     			.map(obj -> (Empleado) obj)
     			.collect(Collectors.groupingBy(Empleado::getGenero));
        			
        					
     	
     	System.out.println("Empleados por Genero: " + empleadosPorGenero);
    	
    }
}






